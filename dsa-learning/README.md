# DSA Learning System — 300 Problems in Java / 30 Days / 3 Passes

Goal: **deep pattern fluency** over 300 curated LeetCode / NeetCode problems in Java,
using **spaced repetition** + **Socratic dialogue** so recall sticks.

## How it works

- **300 problems** organized by pattern in `curriculum.md` (NeetCode 250 + 50 extensions).
- **30-day schedule** in `schedule.md` — each problem is touched **at least 3×**:
  - Pass 1 (Days 1–10): first exposure, build intuition, write solution with hints.
  - Pass 2 (Days 11–20): re-derive from memory, no hints; compare to your Pass 1 code.
  - Pass 3 (Days 21–30): speed pass — target ≤ 8 min/problem; verbal-walk-through only.
- **Daily load:** 30 problems/day × 30 days = 900 touches = 300 problems × 3 reps.
- **Your solutions** go in `solutions/<topic>/<slug>.java` (one per problem).
- **Per-problem notes** live in `problems/<slug>.md` (pattern, pitfalls, complexity).
- **Progress tracked** in `progress.md` — check off each rep, note confidence 1–5.

## How I (Claude) teach

I don't give you the answer. I teach **Socratically**:

1. I present the problem and ask you what you notice.
2. I ask guiding questions to lead you to the pattern.
3. When you're stuck, I give the **smallest possible hint** — never the solution.
4. You write the Java. I review. We dissect edge cases.
5. We extract the **reusable pattern** and store it in `patterns.md`.

See `socratic-protocol.md` for the exact dialogue rules.

## Your daily workflow

```
1. Open schedule.md → find today's 30 problems (split: ~10 new, ~10 Pass-2, ~10 Pass-3).
2. For each new problem: read problem → discuss with Claude → code in Java → commit.
3. For review problems: re-derive → compare to your saved solution → rate confidence.
4. End of day: update progress.md. Anything < 3/5 confidence goes into weak-spots.md.
```

## Files

| File | Purpose |
|------|---------|
| `curriculum.md` | All 300 problems, grouped by 18 patterns |
| `schedule.md` | Day-by-day plan with explicit problem IDs |
| `progress.md` | Your completion + confidence tracker |
| `patterns.md` | Reusable Java templates you derive along the way |
| `weak-spots.md` | Problems you failed — scheduled for extra reps |
| `socratic-protocol.md` | Rules for how we dialogue |
| `problems/*.md` | One note per problem: approach, pitfalls, Big-O |
| `solutions/**/*.java` | Your Java solutions, compilable |
| `memory/state.json` | Live machine-readable state — your level, per-pattern proficiency, per-problem mastery. I update this silently after every problem. |
| `memory/events.jsonl` | Append-only audit log of every attempt; can rebuild `state.json` if needed |
| `memory/level-rubric.md` | How raw confidence/time/hints become level + proficiency |
