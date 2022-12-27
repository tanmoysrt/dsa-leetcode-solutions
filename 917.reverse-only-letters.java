/*
 * @lc app=leetcode id=917 lang=java
 *
 * [917] Reverse Only Letters
 */

// @lc code=start
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] schar = s.toCharArray();
        int lo=0;
        int hi=s.length()-1;
        while (lo < hi) {
            if(!Character.isAlphabetic(schar[lo])) lo++;
            else if(!Character.isAlphabetic(schar[hi])) hi--;
            else{
                char c = schar[lo];
                schar[lo] = schar[hi];
                schar[hi] = c; 
                lo++;
                hi--;
            }
        }
        return new String(schar);
    }
}
// @lc code=end

