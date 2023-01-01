/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        // 1. Transpose matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        // 2. Reverse each row
        int cols = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            // Reverse row
            for (int j = 0; j < cols/2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][cols-1-j];
                matrix[i][cols-1-j] = tmp;
            }
        }
    }
}
// @lc code=end

