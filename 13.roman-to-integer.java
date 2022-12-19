import java.util.HashMap;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanStringToInt(char x){
        switch (x) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
    public int romanToInt(String s) {
        int result  = 0;
        char[] input = s.toCharArray();
        int lastRoman = -1;

        for (int i = input.length-1; i >= 0; i--) {
            int val = romanStringToInt(input[i]);
            if(lastRoman != -1 && lastRoman > val){
                result = result - val;
            }else{
                result = result + val;
            }
            lastRoman = val;
        }

        return result;
    }
}
// @lc code=end

