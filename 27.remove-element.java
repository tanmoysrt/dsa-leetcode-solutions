/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;

        // Total count
        for (int i = 0; i < nums.length;i++) {
            if(nums[i] != val){
                // Delete i th value
                nums[j++] = nums[i];
            }
        }


        return j;
    }
}
// @lc code=end

