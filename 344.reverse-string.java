/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int lo = 0;
        int hi = s.length-1;
        while (lo<hi) {
            char a = s[lo];
            s[lo] = s[hi];
            s[hi] = a;
            lo++;
            hi--;
        }
    }
}
// @lc code=end

