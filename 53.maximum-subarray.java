/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending = 0;
        for (int i = 0; i < nums.length; i++) {
            max_ending = max_ending + nums[i];
            if(max_so_far < max_ending){
                max_so_far = max_ending;
            }
            if(max_ending<0) max_ending = 0;
        }
        return max_so_far;
    }
}
// @lc code=end

