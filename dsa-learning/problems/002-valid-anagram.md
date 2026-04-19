# #2 — Valid Anagram (LC 242, Easy)

**Statement:** Given strings `s` and `t`, return `true` if `t` is an anagram of `s`.

## Pattern

**Frequency-count array + alphabet indexing.** Fixed-size int array keyed by `char - 'a'` tracks net letter frequency.

## Key insights

- `char` is a number — arithmetic on chars gives ASCII/Unicode differences.
- `'c' - 'a' = 2` maps letters to indices 0..25.
- Increment for `s`, decrement for `t` in one loop → all zeros iff anagrams.
- Fixed-size loops are O(1), not O(n).

## Complexity

- **Time:** O(n) — two linear passes; the 26-slot scan is O(1).
- **Space:** O(1) — fixed 26-slot count array.

## Alternatives

- Sort + compare: O(n log n) time, simpler, slower.
- HashMap: O(n) time, O(k) space; required for Unicode.

## Pitfalls

- Forgetting the length check → wrong answer when lengths differ.
- Misjudging fixed-size loop as O(n) instead of O(1).
- Assuming array approach works for Unicode.

## Pass history

| Pass | Date       | Time | Conf | Notes |
|------|------------|------|------|-------|
| 1    | 2026-04-19 | ~15m | 2    | Weak on char arithmetic + count invariant; bonus rep scheduled. |
| 2    |            |      |      |       |
| 3    |            |      |      |       |
| 4    |            |      |      |       |
