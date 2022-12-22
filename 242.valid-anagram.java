import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        char[] char_s = s.toCharArray();
        for (int i = 0; i < char_s.length; i++) {
            map.put(char_s[i], map.getOrDefault(char_s[i], 0)+1);
        }

        char[] char_t = t.toCharArray();
        for (int i = 0; i < char_t.length; i++) {
            map.put(char_t[i], map.getOrDefault(char_t[i], 0)-1);
        }

        for (Character c : map.keySet()) {
            if(map.get(c) != 0) return false;
        }

        return true;
    }
}
// @lc code=end

