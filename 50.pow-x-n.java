/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long tmpn = n;
        if(tmpn <  0) tmpn=-1*tmpn;
        while (tmpn > 0) {
            if(tmpn%2==0){
                x = x*x;
                tmpn = tmpn/2;
            }else{
                ans = ans*x;
                tmpn--;
            }
        }
        if(n<0) ans = 1/ans;
        return ans;
    }
}
// @lc code=end

