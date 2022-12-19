/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    public int titleToNumber(String columnTitle) {
        // Lets understand
        // "SQIH" -> 19×26^3 + 17×26^2 + 9×26^1 + 8×26^0

        char[] arrayOfCharacters = columnTitle.toCharArray();
        int result = 0;
        int length = arrayOfCharacters.length;
        for (int i = 0; i < arrayOfCharacters.length; i++) {
            result = result + ((int)arrayOfCharacters[i]-64) * (int)Math.pow(26, length-1-i);
        }
        return result;
    }
}
// @lc code=end

