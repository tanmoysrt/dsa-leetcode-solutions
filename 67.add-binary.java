/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();

        
        if(a.length() > b.length()) b = "0".repeat(a.length()-b.length()) + b;
        if(b.length() > a.length()) a = "0".repeat(b.length()-a.length()) + a;
        int length = a.length();
        boolean haveCarry = false;

        for (int i = 0; i < length; i++) {
            char m = a.charAt(length-1-i);
            char n = b.charAt(length-1-i);

            int c = 0;
            if(m == '1') c+=1;
            if(n == '1') c+=1;
            if(haveCarry){
                c+=1;
                haveCarry = false;
            }

            if(c > 1) haveCarry = true;
            s.append(c%2 == 1 ? '1' : '0'); 
        }

        if(haveCarry) s.append('1');

        return s.reverse().toString();
    }
}
// @lc code=end

