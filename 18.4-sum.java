import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    long sum = (long)nums[i]+nums[j]+nums[k];
                    if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) continue;
                    int requirednum = target-(int)sum;
                    int indexx = Arrays.binarySearch(nums, requirednum);
                    if(indexx >= 0 && indexx != i && indexx != j && indexx != k){
                        List<Integer> s = new ArrayList<>();
                        s.add(nums[i]);
                        s.add(nums[j]);
                        s.add(nums[k]);
                        s.add(nums[indexx]);
                        Collections.sort(s);
                        set.add(s);                        
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
// @lc code=end

