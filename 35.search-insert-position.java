/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid=-1;

        while(low <= high){
            mid = low + (high-low)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target){
                low = mid+1;
            }
            if(nums[mid] > target){
                high = mid-1;
            }
        }
        return low;
    }
}
// @lc code=end

