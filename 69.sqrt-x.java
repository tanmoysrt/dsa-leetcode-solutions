/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        long ans = 0;
        while (low <= high) {
            long mid = low + (high-low)/2;
            if(mid*mid <= x){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }        
        return (int)ans;
    }
}
// @lc code=end

