# 30-Day Schedule — Spaced Repetition

## The non-negotiable daily target

> **30 touches every day. No skip days. No "I'll catch up tomorrow."**

Why "30 touches"? A *touch* is one pass on one problem. The math is fixed:

```
300 problems × 3 passes = 900 touches
900 touches ÷ 30 days   = 30 touches/day
```

Miss a day → you owe 30 to tomorrow (= 60 the next day, which is humanly impossible).
The system tracks deficit in `memory/state.json → overall.deficit_touches`.

## Math

- 300 problems × 3 passes = **900 problem-touches**.
- 30 days × **30 touches/day** = 900.
- Gap between passes ≈ **10 days** (long enough to force retrieval from long-term memory, short enough that nothing is lost).

## Time budget (honest)

| Pass | Per problem | Per day |
|------|-------------|---------|
| 1 (learn) | ~20 min | ~10 hrs — the heaviest phase |
| 2 (re-derive) | ~10 min | ~5 hrs |
| 3 (speed) | ~5 min | ~2.5 hrs |

If you can't hit 10 hrs/day, run the plan at **60% intensity**: 18 problems/day
across 30 days, then finish reps in a 10-day "Sprint Finale" on weekends.
What matters is the **3-touch discipline**, not the calendar.

## Batches

Split the 300 curriculum problems into **10 batches of 30**, in curriculum order:

- Batch B1 = #1–30, B2 = #31–60, …, B10 = #271–300.

## Daily layout

| Day | Morning — Pass 1 (NEW) | Afternoon — Pass 2 (REVIEW) | Evening — Pass 3 (SPEED) |
|-----|------------------------|------------------------------|---------------------------|
| 1   | B1 (#1–30)             | —                            | —                         |
| 2   | B2 (#31–60)            | —                            | —                         |
| 3   | B3 (#61–90)            | —                            | —                         |
| 4   | B4 (#91–120)           | —                            | —                         |
| 5   | B5 (#121–150)          | —                            | —                         |
| 6   | B6 (#151–180)          | —                            | —                         |
| 7   | B7 (#181–210)          | —                            | —                         |
| 8   | B8 (#211–240)          | —                            | —                         |
| 9   | B9 (#241–270)          | —                            | —                         |
| 10  | B10 (#271–300)         | —                            | —                         |
| 11  | —                      | B1                           | —                         |
| 12  | —                      | B2                           | —                         |
| 13  | —                      | B3                           | —                         |
| 14  | —                      | B4                           | —                         |
| 15  | —                      | B5                           | —                         |
| 16  | —                      | B6                           | —                         |
| 17  | —                      | B7                           | —                         |
| 18  | —                      | B8                           | —                         |
| 19  | —                      | B9                           | —                         |
| 20  | —                      | B10                          | —                         |
| 21  | —                      | —                            | B1                        |
| 22  | —                      | —                            | B2                        |
| 23  | —                      | —                            | B3                        |
| 24  | —                      | —                            | B4                        |
| 25  | —                      | —                            | B5                        |
| 26  | —                      | —                            | B6                        |
| 27  | —                      | —                            | B7                        |
| 28  | —                      | —                            | B8                        |
| 29  | —                      | —                            | B9                        |
| 30  | —                      | —                            | B10                       |

## Daily rituals

**Morning (Pass 1 — ~10 hrs on learning days):**
1. Open `curriculum.md`, find today's 30 new problems.
2. For each: I pose the problem Socratically → you solve in Java →
   save `solutions/<topic>/<slug>.java` + `problems/<slug>.md`.
3. Log confidence 1–5 in `progress.md`.

**Pass 2 (re-derive):**
1. Open `problems/<slug>.md` and read **only** the problem statement.
2. Re-derive the approach from memory. Write the Java from scratch in a temp file.
3. Diff against your Pass-1 solution. Note divergences.
4. Update confidence.

**Pass 3 (speed):**
1. Read each problem title only.
2. **Verbal walkthrough** (record yourself or narrate to me): approach, invariant,
   edge cases, complexity — in under 90 seconds.
3. Any slip → add to `weak-spots.md` with a forced bonus rep the next morning.

## Why this works (the science)

- **Testing effect:** Pass 2 forces retrieval, not recognition. Retrieval > re-reading.
- **Spacing effect:** 10-day gap puts each rep near the "desirable difficulty" boundary — slow recall, which strengthens memory more than fast recall.
- **Interleaving inside each batch:** Each batch of 30 spans **multiple patterns** (by curriculum order), so you can't coast on one technique.
- **Metacognitive calibration:** Confidence scores train you to predict your own recall — a skill that transfers to real interviews.

## If you fall behind

- **Never skip a Pass 2 or Pass 3** in favor of catching up Pass 1. Reviews > novelty.
- Shift tomorrow's new batch; keep the review cadence sacred.
- Missed reps degrade the spacing, not the coverage.
