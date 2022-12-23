/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;

        num = num/10 + num%10;
        return addDigits(num);
    }
}
// @lc code=end

