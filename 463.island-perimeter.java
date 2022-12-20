/*
 * @lc app=leetcode id=463 lang=java
 *
 * [463] Island Perimeter
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){
                    total = total + calcPerimeter(grid, i, j);
                }
            }
        }
        return total;
    }

    public int calcPerimeter(int[][] grid, int row, int col){
        int perimeter = 4;
        // deduct perimeter if found attached block with it
        // chheck top block
        if(
            (row-1 >= 0) &&
            (grid[row-1][col] == 1)
        ) perimeter--;
        // check bottom block
        if(
            (row+1 <= grid.length-1) &&
            (grid[row+1][col] == 1)
        ) perimeter--;
        // check left block
        if(
            (col-1 >= 0) &&
            (grid[row][col-1] == 1)
        ) perimeter--;
        // check right block
        if(
            (col+1 <= grid[0].length-1) &&
            (grid[row][col+1] == 1)
        ) perimeter--;
        return perimeter;
    }
}
// @lc code=end

