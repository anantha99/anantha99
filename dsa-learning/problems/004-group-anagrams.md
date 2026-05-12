# #4 — Group Anagrams (LC 49, Medium)

**Statement:** Given `String[] strs`, group anagrams together. Return `List<List<String>>`.

## Pattern

**Signature-key grouping.** Compute a canonical signature for each string (frequency array stringified, or sorted chars), bucket by signature using a HashMap.

## Key insights

- Anagrams ⇔ identical letter frequencies → identical signature.
- Java `int[]` uses **reference equality** for `.equals()` and `.hashCode()` — cannot be a HashMap key by content. Convert via `Arrays.toString(count)` or `List<Integer>`.
- `computeIfAbsent(key, k -> new ArrayList<>())` = idiom for "get-or-create bucket, then add."
- Lambda `k -> new ArrayList<>()` runs **only** when the key is missing.

## Complexity

- **Time:** O(n·k) where n = #strings, k = avg length. Each string: O(k) to count + O(k) to stringify key.
- **Space:** O(n·k) for output + map.

## Alternative

Sort each string (`"eat" → "aet"`), use sorted string as key. Time O(n·k log k). Simpler code, slightly slower than count-array.

## Pitfalls

- Using `int[]` directly as key → silent bug (every string gets its own bucket).
- Forgetting to copy/wrap before mutating shared state.

## Pass history

| Pass | Date       | Time | Conf | Notes |
|------|------------|------|------|-------|
| 1    | 2026-04-19 | ~20m | 2    | Got design walkthrough but skipped retrieval check; pending Pass 2 validation. |
| 2    |            |      |      |       |
| 3    |            |      |      |       |
| 4    |            |      |      |       |
