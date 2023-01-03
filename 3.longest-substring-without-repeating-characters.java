import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int longest = 0;
        int l = 0;
        for (int i = 0; i < chars.length; i++) {
            while(set.contains(chars[i])){
                set.remove(chars[l]);
                l++;
            };
            set.add(chars[i]);
            longest = Math.max(longest, i-l+1); // righht - left + 1
        }
        return longest;
    }
}
// @lc code=end

