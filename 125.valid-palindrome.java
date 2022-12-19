/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        // Pre-process
        StringBuilder b = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if(Character.isAlphabetic(ch) || Character.isDigit(ch)){
                b.append(Character.toUpperCase(ch));
            }
        }
        String f = b.toString();
        // Palidrome checking
        int low = 0;
        int high = f.length()-1;  
        while(low <= high){
            if(f.charAt(low) != f.charAt(high)) return false;
            low++;
            high--;
        } 
        return true;
    }
}
// @lc code=end

