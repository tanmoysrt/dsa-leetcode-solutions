/*
 * @lc app=leetcode id=860 lang=java
 *
 * [860] Lemonade Change
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int i : bills) {
            if (i == 5) five++;
            else if (i == 10) {five--; ten++;}
            else {
                if (ten > 0) {ten--; five--;} // if we have 10 rs. give 10+5 for 20Rs change
                else five -= 3; // choice -> 5, 10, 20 | 5 & 10 handle beforehand, for 20 change is 15
            }
            if (five < 0) return false;
        }
        return true;
    }
}
// @lc code=end

