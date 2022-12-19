import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length == 0) return new int[]{1};
        ArrayList<Integer> results = new ArrayList<>();
        int carry = 0;

        // add 1 to last digit
        digits[digits.length-1] += 1;

        for (int i = digits.length-1; i >= 0; i--) {
            int tmp = digits[i] + carry;
            carry = tmp/10;
            tmp = tmp%10;
            results.add(tmp);
        }

        if(carry != 0) results.add(carry);
        Collections.reverse(results);
        return results.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
// @lc code=end

