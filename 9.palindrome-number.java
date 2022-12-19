/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        char[] input = Integer.toString(x).toCharArray();

        int start = 0;
        int end = input.length-1;

        while(start < end){
            if(input[start] != input[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
// @lc code=end

