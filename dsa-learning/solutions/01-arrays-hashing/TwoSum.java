package solutions.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 1 — Two Sum (Easy)
 *
 * Pattern: Complement trick with HashMap (value → index).
 * Time:    O(n)   — one pass, O(1) map ops per iteration
 * Space:   O(n)   — map grows up to n entries worst case
 *
 * Critical ordering: check BEFORE put — prevents self-pairing on duplicate values
 * like nums=[3,3], target=6.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{ seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }
}
