# Google Readiness — The Honest Picture

You said you want Google. Here's the truth: **30 days of DSA alone does not land a Google offer**.
DSA gets you past the phone screen. Google L4+ loops include 4–5 onsite interviews —
only 2–3 of them are pure DSA. The rest will sink an unprepared candidate.

This file tracks **all four pillars** of readiness, honestly.

## Pillar 1 — DSA  (the 30-day plan in this repo)

Status: active. Target: NeetCode 150 × 4 passes. Tracked in `memory/state.json`.

Google-specific DSA notes:
- Bias toward **Mediums that feel like Hards** (graphs + DP variants, tricky optimizations).
- Expect **novel twists** on known patterns, not memorized exact problems.
- Communicate while coding. Google weighs **clarity of thought** heavily.

## Pillar 2 — System Design  (NOT in this 30-day plan)

Required for **L4 and above**. Minimum 4–6 weeks of separate prep.

Must cover:
- Scalability basics: load balancers, caching, CDNs, partitioning, replication.
- Core primitives: SQL vs NoSQL, message queues, pub/sub, rate limiting, consistency models.
- Canonical designs: URL shortener, news feed, chat, YouTube, Uber, Google Search.
- Back-of-envelope estimation (QPS, storage, bandwidth).

Resources:
- "Designing Data-Intensive Applications" — Kleppmann (read once).
- System Design Primer (GitHub).
- Alex Xu "System Design Interview" Vol. 1 + 2.

**Action:** schedule 1 hr/day of system design after Day 15 of DSA (when your DSA time halves).

## Pillar 3 — Behavioral + Googliness

Google has an explicit "Googliness" rubric: **thoughtful disagreement, ambiguity tolerance,
bias to action, user-centric thinking**. You need **STAR stories** covering:

- A time you disagreed with your manager's decision.
- A time you shipped something imperfect because you had to.
- A time you influenced without authority.
- A time you changed your mind after new data.
- A technical failure you own.
- A time you handled conflicting priorities.
- A time you mentored someone.
- A time you pushed back on a deadline.

**Target:** 10 STAR stories written out, rehearsed verbally, 90–120 sec each.
Write them in `behavioral/stories.md` (to be created after Day 10).

## Pillar 4 — Mock interviews

DSA on paper ≠ DSA under pressure with a stranger watching.

**Minimum before applying:**
- **5 mock DSA interviews** — platforms: Pramp, interviewing.io, or a peer.
- **2 mock system design** (if going for L4+).
- **2 mock behavioral**.

Start booking mocks from **Day 18 onward**. By then you'll have 2 DSA passes done
and enough pattern recognition to survive a stranger's problem.

## The full timeline to offer

| Week | DSA focus | Adjacent work |
|------|-----------|----------------|
| 1–2  | P1 + early P2 on 150 | — |
| 3    | P2 + P3 | Start system design (1 hr/day) |
| 4    | P3 + P4 | System design continued + 3 STAR stories |
| 5    | Mocks + weak spots | System design + 7 STAR stories |
| 6    | Final polish + mocks | Apply to Google |
| 7–8  | Interview loop | — |

So realistically: **7–8 weeks from today, not 4**, for a credible Google shot at L4+.
If you're aiming L3 (new grad / SWE I), 4–5 weeks is possible — less system design needed.

## Honest success probabilities

| Prep window | DSA mastery | Sys design | Behavioral | Google pass-rate (rough) |
|-------------|-------------|------------|------------|---------------------------|
| 4 wks (this plan only) | Strong | None | Weak | ~5–10% (L3), ~2% (L4) |
| 6 wks (+ sys design + STAR) | Strong | Moderate | Moderate | ~15% (L3), ~8% (L4) |
| 8 wks (+ mocks)  | Strong | Solid | Solid | ~25% (L3), ~15% (L4) |

Google SWE pass rates are ~1–2% baseline. Anything above ~10% is above average.

**No such thing as "easily."** Plan accordingly. I won't let you over-promise
to yourself — that's the fastest way to burn out and quit at Week 3.

## What I'll enforce from you

1. After Day 10, you start a `system-design/` folder — I'll nudge you.
2. After Day 15, you write your first STAR story in `behavioral/stories.md`.
3. After Day 18, you book your first mock on interviewing.io.
4. At Day 25, we review: are you ready to apply or do we need a Week 5–8 extension?

You get to Google the way everyone does: by doing the boring thing every day.
No shortcuts, but also no mysticism.
