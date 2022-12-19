/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0) {
            // If first array empty, copy contents of second array to first
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
        // if second array empty ignore
        if(n==0) return;
        int[] resultArr = new int[m+n];        
        int nums1_pointer;
        int nums2_pointer;

        // initial
        if(nums1[0] < nums2[0]){
            resultArr[0] = nums1[0];
            nums1_pointer = 1;
            nums2_pointer = 0;
        }else{
            resultArr[0] = nums2[0];
            nums1_pointer = 0;
            nums2_pointer = 1;
        }

        int resultArrIndex = 1;

        // do merge
        while(nums1_pointer < m && nums2_pointer < n){
            if(nums1[nums1_pointer] < nums2[nums2_pointer]){
                resultArr[resultArrIndex++] = nums1[nums1_pointer];
                nums1_pointer++;
            }else{
                resultArr[resultArrIndex++] = nums2[nums2_pointer];
                nums2_pointer++;
            }
        }

        // excess merge
        while(nums1_pointer < m){
            resultArr[resultArrIndex++] = nums1[nums1_pointer];
            nums1_pointer++;
        }

        // excess merge
        while(nums2_pointer < n){
            resultArr[resultArrIndex++] = nums2[nums2_pointer];
            nums2_pointer++;
        }

        // Copy content of resultArr to nums
        for (int i = 0; i < resultArr.length; i++) {
            nums1[i] = resultArr[i];
        }
    }
}
// @lc code=end

