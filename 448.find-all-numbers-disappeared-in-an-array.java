import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();

        // the concept is
        // if there is all numbers 1...N
        // then every index number is represented by number in the array
        // so we travverse the number an mark that index as negative
        // now those index that is positive , they have no index number in array
        // hence that's index number not present in list
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            if(nums[Math.abs(index)-1]>0){
                nums[Math.abs(index)-1] = -nums[Math.abs(index)-1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                res.add(i+1);
            }
        }

        return res;
    }
}
// @lc code=end

