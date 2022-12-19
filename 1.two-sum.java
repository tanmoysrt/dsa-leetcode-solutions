import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(numbers.containsKey(target-nums[i])){
                return new int[]{numbers.get(target-nums[i]), i};
            }
            numbers.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
// @lc code=end

