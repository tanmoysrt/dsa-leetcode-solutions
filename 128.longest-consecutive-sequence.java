import java.util.HashSet;

/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        // Create the hashet
        Set<Integer> set = new HashSet<>();
        for (int element : nums) {
            set.add(element);
        }

        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            // Check if it starts of sequence
            if(set.contains(nums[i]-1) == false){
                int len = 0;
                // start counting , unless an number found that not exists
                while(set.contains(nums[i]+len)){
                    len = len +1;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}
// @lc code=end

