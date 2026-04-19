# DSA Learning System — NeetCode 150 / Java / 30 Days / 4 Passes (hybrid)

Goal: **Google-interview-ready DSA fluency** over the NeetCode 150, using
**worked-example-then-retrieval** pedagogy + **4 spaced repetitions**, landing
every problem at ≤ 15 min by Day 30.

## How it works

- **150 problems** in `curriculum.md`, organized by 18 patterns (the full NeetCode 150).
- **4 passes** over 30 days:
  - **P1 (Days 1–10) — worked example + explain-back.** I show annotated Java; you explain every line; I probe.
  - **P2 (Days 11–18) — solo.** Problem statement only. You write from scratch.
  - **P3 (Days 19–24) — timed.** Stopwatch. E=5m, M=10m, H=18m.
  - **P4 (Days 25–30) — verbal walkthrough.** ≤ 2 min per problem, narrated.
- **Auto-downgrade:** if you fall 40 touches behind, the system drops P3 for affected batches (keeps the 3-pass scientific floor).
- **Daily target:** ~20 touches/day average (15 on P1 days, 19 on P2, 25 on P3/P4).
- **End-state target:** every problem solved ≤ 15 min by Day 30.
- **Google readiness** is broader than DSA — see `google-readiness.md` for the full picture (system design, behavioral, mocks).

## How I (Claude) teach — **hybrid**

- **Pass 1 (worked example + explain-back):** I show you a clean, annotated Java
  solution. You explain every line — data structure choice, invariants, edge cases.
  I probe with targeted questions. You don't advance until you own every choice.
- **Passes 2/3/4 (retrieval):** I show problem only. You produce the code from
  memory. This is where durable mastery is built.

This matches the **expertise reversal effect**: beginners benefit from worked
examples, experienced solvers benefit from retrieval. We give you the right
treatment at each stage.

See `socratic-protocol.md` for exact dialogue rules.

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
