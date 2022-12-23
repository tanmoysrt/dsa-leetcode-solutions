/*
 * @lc app=leetcode id=482 lang=java
 *
 * [482] License Key Formatting
 */

// @lc code=start
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        if(s.isEmpty()) return "";

        StringBuilder b = new StringBuilder();
        s= s.toUpperCase();
        String firstGroup = s.split("-")[0];
        b.append(firstGroup);
        s = s.replaceAll("-", "");
        int pointer = firstGroup.length();
        while (pointer < s.length()) {
            if(pointer+k < s.length()){
                b.append("-");
                b.append(s.substring(pointer, pointer+k));
                pointer = pointer+k;
            }else{
                b.append("-");
                b.append(s.substring(pointer, s.length()));
                pointer = s.length();
            }
        }


        return b.toString();
    }
}
// @lc code=end

