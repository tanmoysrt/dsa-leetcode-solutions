import java.util.HashMap;

/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] spliited = s.split(" ");
        char[] patterns = pattern.toCharArray();
        HashMap<Character, String> map= new HashMap<>();

        if(spliited.length != patterns.length) return false;
        
        for (int i = 0; i < patterns.length; i++) {
            if(map.containsKey(patterns[i])){
                if(!map.get(patterns[i]).equals(spliited[i])){
                    return false;
                }
            }else{
                if(map.containsValue(spliited[i])) return false;
                map.put(patterns[i], spliited[i]);

            }
        }

        return true;
    }
}
// @lc code=end

