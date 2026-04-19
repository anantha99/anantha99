# Reusable Java Patterns

You'll populate this file as you derive patterns during problem-solving. Each entry
captures the **shape** — the template you can paste and specialize.

One-sentence rule: *if you can't write the template from memory, you don't own the pattern yet*.

---

## (Empty — patterns you derive go here.)

### Pattern 1 — Seen-set for membership check

**Shape:**
```java
Set<T> seen = new HashSet<>();
for (T x : input) {
    if (!seen.add(x)) {
        // x was already present — duplicate detected
        return /* handle hit */;
    }
}
// no hit
```

**When to reach for it:** you need to know "have I encountered this value before?" and nothing more (no count, no index).

**Why it works:** HashSet.add returns `false` iff the element is already present. O(1) average per call via hashing.

**Big-O:** O(n) time, O(n) space.

**Problems using it:** #1 Contains Duplicate, and (preview) #9 Longest Consecutive, #37 Linked List Cycle (set-of-nodes version), #139 Happy Number.

### Pattern 2 — Frequency-count array (alphabet indexing)

**Shape:**
```java
int[] count = new int[26];          // 26 for a-z, 52 for Aa-Zz, 128 for ASCII
for (char c : str.toCharArray()) {
    count[c - 'a']++;               // map letter to index 0..25
}
```

**The char-arithmetic trick:** `char` is stored as a number. `'c' - 'a' = 2`,
giving a perfect index for a fixed-alphabet count array.

**When to reach for it:** counting letter frequencies, detecting anagrams,
character rolling hashes, sliding-window string problems with small alphabet.

**Fixed-size ≠ O(n):** a loop over `count` (always 26 iterations) is O(1) in Big-O,
regardless of input size.

**When NOT to use it:** Unicode inputs — switch to `HashMap<Character, Integer>`.

**Big-O:** O(n) time (single pass), O(1) space (fixed 26 slots).

**Problems using it:** #2 Valid Anagram, (preview) #4 Group Anagrams, #17 Longest
Repeating Char Replacement, #18 Permutation in String, #76 Minimum Window Substring.

Expected entries by end of Day 10:

1. Hash-map-for-complement (Two Sum family)
2. Two-pointer shrink/expand (palindrome, two-sum-sorted, container)
3. Sliding window variable size (longest substring, min window)
4. Sliding window fixed size
5. Monotonic stack (next greater, daily temperatures)
6. Monotonic deque (sliding window max)
7. Binary search on answer (Koko, ship packages)
8. Binary search on array
9. Fast/slow pointer (cycle detection)
10. Reverse linked list (iterative + recursive)
11. DFS on tree (recursive + iterative w/ stack)
12. BFS on tree (level order with queue)
13. BST in-order = sorted
14. Trie insert/search
15. Heap for top-K
16. Heap for scheduling (two heaps for median)
17. Backtracking skeleton (with pruning)
18. DFS on grid (4-dir, visited/inplace)
19. BFS on grid (shortest path)
20. Topological sort (Kahn + DFS)
21. Union-Find (path compression + union by rank)
22. Dijkstra with heap
23. Bellman-Ford / BFS with K stops
24. DP — 1-D bottom-up
25. DP — 1-D with rolling array
26. DP — 2-D bottom-up
27. DP — knapsack (0/1 vs unbounded)
28. Greedy — interval scheduling
29. Bit tricks (XOR, lowbit, popcount)
