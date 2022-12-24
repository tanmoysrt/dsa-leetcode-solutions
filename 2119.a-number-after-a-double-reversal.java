/*
 * @lc app=leetcode id=2119 lang=java
 *
 * [2119] A Number After a Double Reversal
 */

// @lc code=start
class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == reverse(reverse(num));
    }
    public int reverse(int num){
        int res = 0;
        while (num != 0) {
            res = res*10 + num%10;
            num = num/10;
        }
        return res;
    }
}
// @lc code=end

