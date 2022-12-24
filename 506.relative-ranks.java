import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=506 lang=java
 *
 * [506] Relative Ranks
 */

// @lc code=start
class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->b[1]-a[1]);
        for (int i = 0; i < score.length; i++) {
            pq.offer(new int[]{i, score[i]});
        }
        String[] results = new String[score.length];
        for (int i = 1; i <= score.length; i++) {
            int[] res = pq.poll();
            if(i==1){
                results[res[0]] = "Gold Medal";
            }else if(i==2){
                results[res[0]] = "Silver Medal";
            }else if(i==3){
                results[res[0]] = "Bronze Medal";
            }else{
                results[res[0]] = Integer.toString(i);
            }
        }
        return results;
    }
}
// @lc code=end

