import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if(rowIndex >= 0) result.add(1);
        if(rowIndex >= 1) {
            result.clear();
            result.addAll(Arrays.asList(1,1));
        }
        if(rowIndex <= 1) return result;

        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> tmp = new ArrayList<>(result);
            result.clear();
            result.add(1);
            for (int j = 0; j < tmp.size()-1; j++) {
                result.add(tmp.get(j)+tmp.get(j+1));
            }
            result.add(1);
        }

        return result;
    }
}
// @lc code=end

