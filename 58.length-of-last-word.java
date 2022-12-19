/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        boolean isLastCharWhiteSpace = false;
        int count = 0;
        for (char c : s.toCharArray()) {
            if(c == ' ') isLastCharWhiteSpace = true;
            else{
                if(isLastCharWhiteSpace){
                    count = 0;
                }
                count = count+1;
                isLastCharWhiteSpace = false;
            }
        }

        return count;
    }
}
// @lc code=end

