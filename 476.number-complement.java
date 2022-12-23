/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 */

// @lc code=start
class Solution {
    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '0') b.append('1');
            else b.append('0');
        }
        return Integer.parseInt(b.toString(), 2);
    }
}
// @lc code=end

