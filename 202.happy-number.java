import java.util.HashSet;

/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1) {
            int sum = 0;

            while(n != 0){
                int d = n%10;
                sum = sum + d*d;
                n = n/10;
            }  

            if(set.contains(sum)) return false;
            else set.add(sum);

            n = sum;
        }

        return true;
    }
}
// @lc code=end

