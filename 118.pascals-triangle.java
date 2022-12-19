import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows >= 1) result.add(Arrays.asList(1));
        if(numRows >= 2) result.add(Arrays.asList(1,1));
        if(numRows <= 2) return result;

        for (int i = 3; i <= numRows; i++) {
            List<Integer> tmp = result.get(result.size()-1);
            List<Integer> res = new ArrayList<>();
            res.add(1);
            for (int j = 0; j < tmp.size()-1; j++) {
                res.add(tmp.get(j)+tmp.get(j+1));
            }
            res.add(1);
            result.add(res);
        }

        return result;
    }
}
// @lc code=end

