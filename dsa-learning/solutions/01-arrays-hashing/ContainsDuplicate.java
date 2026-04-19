package solutions.arrays_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * LC 217 — Contains Duplicate (Easy)
 *
 * Pattern: Seen-set for membership check.
 * Time:    O(n)        — n iterations × O(1) HashSet ops
 * Space:   O(n)        — set grows up to n elements in the all-unique worst case
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            if (!seen.add(n)) {
                return true;
            }
        }
        return false;
    }
}
