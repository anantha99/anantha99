# #1 — Contains Duplicate (LC 217, Easy)

**Statement:** Given an integer array `nums`, return `true` if any value appears at least twice, else `false`.

## Pattern

**Seen-set for membership check.** Use a `HashSet` to record what you've encountered; O(1) contains lets you detect repeats in a single pass.

## Key insight

Data-structure choice is a cost decision, not a correctness decision. `ArrayList.contains` would give the right answer but turns the loop from O(n) into O(n²) because each contains-call is O(n). HashSet gives O(1) contains via hashing.

## Complexity

- **Time:** O(n) — one pass × O(1) HashSet ops per iteration.
- **Space:** O(n) — worst case (all unique) the set grows to `n`.

## Pitfalls

- Claiming O(n) because "only one loop" without checking per-iteration cost.
- Reaching for `HashMap` when all you need is membership (not count).
- Confusing single `contains()` call (O(n)) with total `n × contains()` cost (O(n²)).

## Pass history

| Pass | Date       | Time | Conf | Notes |
|------|------------|------|------|-------|
| 1    | 2026-04-19 | ~25m | 3    | Needed hints on hashing mechanism + multiplication rule. |
| 2    |            |      |      |       |
| 3    |            |      |      |       |
| 4    |            |      |      |       |
