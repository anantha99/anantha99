# Memory — Live Skill State

This folder is the **single source of truth** for your DSA progress. Everything else
(`progress.md`, `weak-spots.md`) is human-readable; this folder is **machine-readable**
so I can update it silently after every session.

## Files

| File | Purpose | Mutability |
|------|---------|------------|
| `state.json` | Live state: level, per-pattern proficiency, per-problem history | Mutable, append-mostly |
| `level-rubric.md` | How `level` and `proficiency` are computed from raw signals | Read-only spec |
| `events.jsonl` | Immutable log of every pass attempt (one JSON per line) | Append-only |

## Why two stores?

- **`events.jsonl`** is the durable, truthful audit log — never edited, only appended.
  If `state.json` ever gets corrupted, it can be **rebuilt** from events.
- **`state.json`** is the rolled-up view, optimized for "what's my level right now?"
  queries without parsing 900 events.

This is the same pattern as event-sourced systems (Kafka + materialized view).

## Schema — `state.json`

```jsonc
{
  "$schema_version": 1,
  "meta":     { ... session-level pointers ... },
  "overall":  { ... aggregate scores across all 300 ... },
  "patterns": { "<pattern-slug>": { level, proficiency, total, touched, avg_conf, weak } },
  "problems": { "<problem-slug>": { lc, pattern, difficulty, passes:[...], mastery } },
  "weak_spots": [ ... ],
  "history":   [ ... daily summaries ... ]
}
```

A `passes` entry looks like:
```jsonc
{ "pass": 1, "date": "2026-04-18", "confidence": 4, "time_min": 12, "needed_hints": false }
```

Only **touched** problems get an entry under `problems` — keeps the file lean.
A 100% complete state.json is ≈ 60 KB (300 problems × ~200 B each).

## Schema — `events.jsonl`

One JSON object per line, immutable, append-only:
```
{"ts":"2026-04-18T10:14:22Z","kind":"attempt","slug":"two-sum","pass":1,"confidence":4,"time_min":11,"hints":0}
{"ts":"2026-04-18T10:31:05Z","kind":"attempt","slug":"valid-anagram","pass":1,"confidence":5,"time_min":7,"hints":0}
{"ts":"2026-04-18T22:00:00Z","kind":"day_close","day":1,"p1":30,"p2":0,"p3":0}
```

Event kinds:
- `attempt` — one pass on one problem
- `day_close` — end-of-day rollup
- `level_up` — fired when overall or per-pattern level changes
- `weak_spot_added` / `weak_spot_resolved`
- `pattern_unlocked` — first time you complete all P1 in a pattern

## Scalability

- `state.json` grows **linearly with touched problems**, capped at ~60 KB.
- `events.jsonl` grows **linearly with attempts** (~150 B/event × 900 = ~135 KB at 30-day completion).
- If you extend beyond 300 problems, just append to `curriculum.md` and the schema scales — no migration needed.
- For >5,000 problems we'd partition `events.jsonl` by month (`events-2026-04.jsonl`); not needed yet.

## Update protocol (what I do automatically)

After every Socratic session on a problem:
1. Append one `attempt` event to `events.jsonl`.
2. Upsert the problem entry under `state.json → problems`.
3. Recompute the affected pattern's aggregates.
4. Recompute `overall` aggregates.
5. If a level threshold is crossed, append a `level_up` event.
6. Bump `meta.last_updated`.

You don't have to ask me — it just happens. You can always `cat memory/state.json | jq .overall`
to see your current level.
