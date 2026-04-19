# 30-Day Schedule — 4 Passes on NeetCode 150

## Non-negotiable daily target (adaptive)

> **20 touches/day average.** Heavier at the start, lighter at the end.

Math: 150 problems × 4 passes = **600 touches**. 600 / 30 = **20/day average**.

## Wave structure

| Wave | Pass | Days | Touches/day | Per-problem time | Daily hours |
|------|------|------|-------------|-------------------|-------------|
| 1 | **P1 — worked example + explain-back** | 1–10 | 15 | ~25 min | ~3.5 hrs |
| 2 | **P2 — solo solve from problem** | 11–18 | 19 | ~15 min | ~3.0 hrs |
| 3 | **P3 — timed retrieval (≤ target time)** | 19–24 | 25 | ~10 min | ~2.5 hrs |
| 4 | **P4 — verbal walkthrough** | 25–30 | 25 | ~5 min | ~1.5 hrs |

Total: 10×15 + 8×19 + 6×25 + 6×25 = **602 ≈ 600** ✓.

End-state target: **every touched problem ≤ 15 min** by Day 30.

## 10 batches of 15 problems (curriculum order)

- B1: #1–15, B2: #16–30, B3: #31–45, B4: #46–60, B5: #61–75,
  B6: #76–90, B7: #91–105, B8: #106–120, B9: #121–135, B10: #136–150.

## Day-by-day

| Day | Pass | Target | Batch(es) covered |
|-----|------|--------|-------------------|
| 1   | P1 | 15     | B1 (#1–15) |
| 2   | P1 | 15     | B2 (#16–30) |
| 3   | P1 | 15     | B3 |
| 4   | P1 | 15     | B4 |
| 5   | P1 | 15     | B5 |
| 6   | P1 | 15     | B6 |
| 7   | P1 | 15     | B7 |
| 8   | P1 | 15     | B8 |
| 9   | P1 | 15     | B9 |
| 10  | P1 | 15     | B10 |
| 11  | P2 | 19     | B1 + 4 from B2 |
| 12  | P2 | 19     | rest of B2 + 8 from B3 |
| 13  | P2 | 19     | rest of B3 + 12 from B4 |
| 14  | P2 | 19     | rest of B4 + B5 partial |
| 15  | P2 | 19     | B5 tail + B6 |
| 16  | P2 | 19     | B7 partial |
| 17  | P2 | 19     | B8 partial |
| 18  | P2 | 19     | B9 + B10 |
| 19  | P3 | 25     | B1 + 10 of B2 |
| 20  | P3 | 25     | rest of B2 + B3 |
| 21  | P3 | 25     | B4 + 10 of B5 |
| 22  | P3 | 25     | rest of B5 + B6 |
| 23  | P3 | 25     | B7 + 10 of B8 |
| 24  | P3 | 25     | rest of B8 + B9 + 5 of B10 |
| 25  | P4 | 25     | B1 + 10 of B2 |
| 26  | P4 | 25     | rest of B2 + B3 |
| 27  | P4 | 25     | B4 + 10 of B5 |
| 28  | P4 | 25     | rest of B5 + B6 |
| 29  | P4 | 25     | B7 + 10 of B8 |
| 30  | P4 | 25     | rest of B8 + B9 + B10 |

Exact problem IDs per day live in `memory/state.json → daily_targets[i].problems`.

## Auto-downgrade rule (safety valve)

If by end of Day N the `memory/state.json → overall.deficit_touches` exceeds
**40** (two days behind), the system automatically:

1. Marks P3 as **optional** for the batches you've already finished P2 on.
2. Redistributes the remaining touches into P2 (deepest) and P4 (speed).
3. Logs a `plan_downgrade` event and keeps your level honest.

End-state still meets the **≥ 3-pass floor** for every problem — i.e., you
always hit scientific minimum for memory consolidation.

## Pass definitions

**P1 — Worked example + explain-back** (hybrid approach)
- I show the problem and a **clean annotated Java solution**.
- You explain every line, I probe with "why this data structure?", "what's the invariant?", "what breaks on empty input?".
- You don't move on until you can justify every choice.
- Save to `solutions/<topic>/<slug>.java`, update `problems/<slug>.md`.

**P2 — Solo solve from problem**
- I show the problem statement only.
- You write Java from scratch. No peeking at Pass 1.
- After: diff against your P1 code. Note divergences, decide which is better.

**P3 — Timed retrieval**
- Stopwatch. Target time per problem by difficulty: E=5min, M=10min, H=18min.
- You solve or skip. Skipped problems auto-add to `weak-spots.md` with a bonus rep.

**P4 — Verbal walkthrough**
- Read title only. **Narrate aloud** (record yourself):
  approach → data structures → invariant → edge cases → O(time)/O(space).
- ≤ 2 min per problem. Any slip → weak-spot.

## Daily rituals

**Start of day:** open `memory/state.json`, read `today` block (your problem list and target).
**End of day:** append `day_close` event to `memory/events.jsonl`, my job to do.
**Streak discipline:** zero skip days. 30-min minimum even on bad days — hit 1-2 P4 passes.
