import java.util.ArrayList;

/*
 * @lc app=leetcode id=507 lang=java
 *
 * [507] Perfect Number
 */

// @lc code=start
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num < 3) return false;
        int sum = 1;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num%i == 0) sum = sum + i + num/i; // as i * num/i = num
        }
        if(Math.sqrt(num)*Math.sqrt(num) == num){
            sum = sum + (int)Math.sqrt(sum);
        }
        return num == sum;
    }
}
// @lc code=end

