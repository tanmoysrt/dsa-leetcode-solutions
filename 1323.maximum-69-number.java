/*
 * @lc app=leetcode id=1323 lang=java
 *
 * [1323] Maximum 69 Number
 */

// @lc code=start
class Solution {
    public int maximum69Number (int num) {
        Stack<Integer> st = new Stack();
        while(num > 0) {
            int x = num%10;
            num = num/10;
            st.push(x);
        }
        int res = 0;
        boolean found = false;
        while(!st.isEmpty()) {
            int x = st.pop();
            if(x == 6 && found == false) {
                x = 9;
                found = true;
            }
            res = res*10 + x;
        }
        return res;
    }
}
// @lc code=end

