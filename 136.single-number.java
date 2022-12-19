/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int x = nums[0];
        for (int i = 1; i < nums.length; i++) {
            x = x^nums[i];
        }
        return x;
    }
}
// @lc code=end

