/*
 * @lc app=leetcode id=766 lang=java
 *
 * [766] Toeplitz Matrix
 */

// @lc code=start
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        if(row == 0) return true;
        int col = matrix[0].length;
        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j < col-1; j++) {
                if(matrix[i][j] != matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
}
// @lc code=end

