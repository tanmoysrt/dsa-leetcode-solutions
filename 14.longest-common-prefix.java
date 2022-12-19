import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String result = "";
        int pointer = 0;
        int minLength = Arrays.asList(strs)
                                .stream()
                                .map(i -> i.length())
                                .min(Comparator.naturalOrder())
                                .get().intValue();
        while(pointer < minLength){
            for (int i = 0; i < strs.length-1; i++) {
                if(strs[i].charAt(pointer) != strs[i+1].charAt(pointer)){
                    return result;
                }
            }
            result = result + strs[0].charAt(pointer);
            pointer = pointer + 1;
        }
        return result;
    }
}
// @lc code=end

