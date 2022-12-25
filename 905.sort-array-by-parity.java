/*
 * @lc app=leetcode id=905 lang=java
 *
 * [905] Sort Array By Parity
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] % 2 == 0) {
                swap(nums, i++, j);
            }
            j++;
        }
        return nums;
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

// @lc code=end

