/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        // find the majority elemen
        int count = 0;
        int candidate = -1;
        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                candidate = nums[i];
                count++;
            }else{
                if(nums[i] == candidate){
                    count++;
                }else{
                    count--;
                }
            }
        }

        // veriify for n/2 times
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == candidate) count++;
        }
        if(count > nums.length/2) return candidate;
        return -1;
    }
}
// @lc code=end

