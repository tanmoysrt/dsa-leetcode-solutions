/*
 * @lc app=leetcode id=2114 lang=java
 *
 * [2114] Maximum Number of Words Found in Sentences
 */

// @lc code=start
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (int i = 0; i < sentences.length; i++) {
            maxWords = Math.max(maxWords, sentences[i].split(" ").length);
        }
        return maxWords;
    }
}
// @lc code=end

