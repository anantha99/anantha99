# Level Rubric

How raw signals (confidence, time, hints) become **level** and **proficiency**.

## Inputs per attempt

| Signal       | Range | Captured when |
|--------------|-------|---------------|
| `confidence` | 1–5   | After every pass — your honest self-rating |
| `time_min`   | int   | Stopwatch from problem statement to working code |
| `hints`      | 0–5   | Number of hint-ladder steps I gave you (0 = solo) |
| `pass`       | 1/2/3 | Which pass it was |

## Per-problem `mastery` (0.0 – 1.0)

```
mastery = 0.5 * conf_score + 0.3 * time_score + 0.2 * solo_score
```

where, across the problem's recorded passes:

- `conf_score   = avg(confidence) / 5`
- `time_score   = clamp(1 - (avg(time_min) - target_time) / target_time, 0, 1)`
  - `target_time = 5 min` (Easy), `12 min` (Medium), `25 min` (Hard)
- `solo_score   = 1 - avg(hints) / 5`

A problem is **mastered** when `mastery ≥ 0.8` AND it has at least 2 passes recorded.

## Per-pattern `proficiency` (0 – 100)

```
proficiency = 100 * (
  0.6 * (sum(mastery_i for touched problems) / pattern.total)
  + 0.3 * (touched / pattern.total)
  + 0.1 * (mastered_count / pattern.total)
)
```

Roughly: weighted by depth (mastery) **and** breadth (coverage), with a bonus for
fully-mastered problems so partial knowledge doesn't inflate the score.

## Level bands

Applies both to per-pattern `proficiency` and to `overall.level_score`.

| Score   | Level         | Meaning |
|---------|---------------|---------|
| 0–14    | Novice        | Hasn't seen most of it |
| 15–34   | Beginner      | Recognizes patterns with help |
| 35–54   | Intermediate  | Solves typical problems solo, slowly |
| 55–74   | Advanced      | Solves quickly, derives reliably |
| 75–89   | Expert        | Fluent, can teach others |
| 90–100  | Master        | Interview-ready at FAANG bar |

## `overall.level_score`

```
overall.level_score = weighted_avg(pattern.proficiency, weight = pattern.total)
```

i.e. patterns with more problems (Trees 25, DP-1D 20) pull the overall score more
than smaller patterns (Tries 5). This matches interview reality.

## Side metrics (informational, not in level)

- `current_streak_days` — consecutive days with ≥ 1 attempt event.
- `median_solve_minutes` — across the most recent 30 attempts.
- `weak_spots.count` — open weak spots; does **not** lower level, but a pattern with
  ≥ 3 weak spots cannot rise above Intermediate until they're cleared.

## Daily target tracking

`overall.on_track` and `overall.deficit_touches` derive from comparing
`total_touches` to the **expected** count for today:

```
expected_touches_by_today = sum(daily_targets[i].target for i in 1..meta.current_day)
deficit_touches           = max(0, expected_touches_by_today - overall.total_touches)
on_track                  = (deficit_touches == 0)
```

If `deficit_touches > 60` (two days behind), I'll **interrupt the dialogue** and
ask whether to triage (drop low-value problems) or extend the window. We don't
silently fall behind.

## Why this rubric

- **Confidence-weighted**, because self-prediction is the skill that transfers to interviews.
- **Time-aware**, because Pass 3 is a speed pass — slow correct ≠ ready.
- **Hint-penalized**, because solo derivation is the actual goal.
- **Coverage + depth combined**, so you can't game it by hammering one pattern.
- **Cap on weak-spot pollution**, because lingering gaps are real risk.
