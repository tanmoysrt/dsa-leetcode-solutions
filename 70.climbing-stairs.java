import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int a=0;
        int b=1;

        for (int i = 0; i < n; i++) {
            int tmp = a+b;
            a = b;
            b = tmp;
        }

        return b;
    }

    public int helper(int n, Map<Integer, Integer> map){
        if(map.containsKey(n)) return map.get(n);
        if(n <= 0) return 0;
        if(n == 1 || n == 2){
            map.put(n, n);
            return n;
        }
        int steps = helper(n-1, map) + helper(n-2, map);
        map.put(n, steps);
        return steps;
    }
}
// @lc code=end

