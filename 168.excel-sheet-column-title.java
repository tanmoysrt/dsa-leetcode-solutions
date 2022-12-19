/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder b = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber = columnNumber - 1;
            int remainder = columnNumber%26;
            b.append((char)(65+remainder));
            columnNumber = columnNumber/26;
        }

        return b.reverse().toString();
    }
}
// @lc code=end

