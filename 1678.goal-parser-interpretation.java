/*
 * @lc app=leetcode id=1678 lang=java
 *
 * [1678] Goal Parser Interpretation
 */

// @lc code=start
class Solution {
    public String interpret(String command) {
        StringBuilder b = new StringBuilder();
        int lastPoint = 0;
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == 'G') b.append('G');
            else if(command.charAt(i) == '(') lastPoint = i;
            else if(command.charAt(i) == ')'){
                int length = i-lastPoint+1;
                if(length == 2){
                    b.append('o'); // o
                }
                else if(length == 4){
                    b.append("al"); //al
                }
            }
        }   
        return b.toString();
    }
}
// @lc code=end

