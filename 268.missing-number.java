import java.util.Arrays;

/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        int expectedSum = (nums.length * (nums.length + 1)/2);
        return expectedSum - sum;
    }
}
// @lc code=end

