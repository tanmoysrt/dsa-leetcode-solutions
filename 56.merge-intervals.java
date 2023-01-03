import java.util.Arrays;

/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        // Sort normally
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
        int[][] tmp = new int[intervals.length][2];
        int count=0;
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            if(end>=start2){
                // If [start, end], [start2, end2]
                // start2 >= end
                end = Math.max(end, end2);
            }else{
                tmp[count][0] = start;
                tmp[count][1] = end;
                count++;
                start = start2;
                end = end2;
            }       
        }
        // Add the last
        tmp[count][0] = start;
        tmp[count][1] = end;
        count++;
        // Recreate result array
        int[][] result = new int[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = tmp[i][0];
            result[i][1] = tmp[i][1];
        }
        return result;
    }
}
// @lc code=end

