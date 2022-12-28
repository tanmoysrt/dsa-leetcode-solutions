/*
 * @lc app=leetcode id=941 lang=java
 *
 * [941] Valid Mountain Array
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int peak=0;
        int valley=0;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                peak++;
            }
            if(arr[i-1] >= arr[i] && arr[i] <= arr[i+1]){
                valley++;
            }
        }
        return peak == 1 && valley == 0;
    }
}
// @lc code=end

