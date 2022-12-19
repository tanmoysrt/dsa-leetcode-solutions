import java.util.ArrayList;
import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] input = s.toCharArray();

        for (int i = 0; i < input.length; i++) {
            if(
                (input[i] == ')' && !stack.isEmpty() && stack.peek() == '(') ||
                (input[i] == '}' && !stack.isEmpty() && stack.peek() == '{') ||
                (input[i] == ']' && !stack.isEmpty() && stack.peek() == '[')
            ){
                stack.pop();
            }
            else{
                stack.add(input[i]);
            }
        }
        
        return stack.isEmpty();
    }
}
// @lc code=end

