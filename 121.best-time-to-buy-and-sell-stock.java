/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int least_buying_price = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            // If got lower price, update buying price
            if(prices[i] < least_buying_price) least_buying_price = prices[i];
            
            // If they also buy and sell on same day , it is 0
            // and we now profit is not going to negative , so we can simply ignore this that 
            // what will happen if in program, user sell and buy at same day
            int today_profit = prices[i] - least_buying_price;
            // Compare today's profit and current profit
            profit = Math.max(today_profit, profit);
        }

        return profit;
    }
}
// @lc code=end

