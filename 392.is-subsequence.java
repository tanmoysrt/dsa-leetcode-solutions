import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;
        int lettersInPlace = 0;
        for (int i = 0; i < t.length(); i++) {
            if(s.charAt(lettersInPlace) == t.charAt(i)){
                lettersInPlace++;
                if(lettersInPlace >= s.length()) return true; 
            }
        }
        return false;
    }
}
// @lc code=end

