/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        double p = Math.log10(n)/Math.log10(3);
        if(p - (int)p == 0){
            return true;
        }
        return false;
    }
}
// @lc code=end

