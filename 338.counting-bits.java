import java.util.ArrayList;

/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            result.add(Integer.bitCount(i));
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
// @lc code=end

