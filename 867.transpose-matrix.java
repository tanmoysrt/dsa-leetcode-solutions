/*
 * @lc app=leetcode id=867 lang=java
 *
 * [867] Transpose Matrix
 */

// @lc code=start
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rowsN = matrix.length;
        int colsN = rowsN == 0 ? 0 : matrix[0].length;
        int[][] result = new int[colsN][rowsN];
        for (int i = 0; i < colsN; i++) {
            for (int j = 0; j < rowsN; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
}
// @lc code=end

