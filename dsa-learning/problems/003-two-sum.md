# #3 — Two Sum (LC 1, Easy)

**Statement:** Given `int[] nums` and `int target`, return the indices of two numbers that sum to `target`. Exactly one solution; no same-index reuse.

## Pattern

**Complement trick with HashMap.** For each element, look up `target - nums[i]` in a map of previously-seen `value → index`. O(1) retrospective lookup replaces O(n) inner scan.

## Key insights

- Trade O(n) space for O(n) time vs naive O(n²) nested loop.
- **Check before put** — otherwise `nums=[3,3], target=6` returns `[0,0]` (same index twice).
- HashMap `put` on duplicate key silently **overwrites**, doesn't throw.

## Complexity

- **Time:** O(n) — one pass × O(1) per iteration.
- **Space:** O(n) — map up to `n` entries worst case.

## Variants

- Return values instead of indices → `return new int[]{complement, nums[i]}`.
- Sorted input (Two Sum II) → two pointers instead, O(1) space.

## Pitfalls

- Put-before-check → self-pairing bug.
- Returning values when problem asks for indices (or vice versa).
- Assuming HashMap throws on duplicate keys — it doesn't.

## Pass history

| Pass | Date       | Time | Conf | Notes |
|------|------------|------|------|-------|
| 1    | 2026-04-19 | ~15m | 3    | Got complement trick and order; slipped on indices-vs-values framing. |
| 2    |            |      |      |       |
| 3    |            |      |      |       |
| 4    |            |      |      |       |
