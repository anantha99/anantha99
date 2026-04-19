package solutions.arrays_hashing;

/**
 * LC 242 — Valid Anagram (Easy)
 *
 * Pattern: Frequency-count array with alphabet-indexing trick.
 * Time:    O(n)   — two linear passes, the fixed 26-slot scan is O(1)
 * Space:   O(1)   — count array is fixed size 26, independent of n
 *
 * Key tricks:
 *   - 'c' - 'a' = 2 → maps each lowercase letter to an array index [0..25]
 *   - single-pass +/- net difference: if anagrams, every slot ends at 0
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
}
