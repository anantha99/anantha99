package solutions.arrays_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LC 49 — Group Anagrams (Medium)
 *
 * Pattern: Signature-key grouping. Frequency array → String key → HashMap of buckets.
 * Time:    O(n * k)   — n strings × O(k) to build each count array
 * Space:   O(n * k)   — output stores every input string; map keys are O(k) each
 *
 * Key concept: Java arrays use reference equality, so int[] can't be a HashMap key
 * by content. Stringify it (or wrap in a List) before keying.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}
