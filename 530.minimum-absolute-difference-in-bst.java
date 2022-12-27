/*
 * @lc app=leetcode id=530 lang=java
 *
 * [530] Minimum Absolute Difference in BST
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int minimumVal = Integer.MAX_VALUE;
    Integer prev = null;
    public int getMinimumDifference(TreeNode root) {
        if(root == null) return minimumVal;
        getMinimumDifference(root.left);
        if(prev != null){
            minimumVal = Math.min(minimumVal, Math.abs(root.val - prev));
        }
        prev = root.val;
        getMinimumDifference(root.right);
        return minimumVal;
    }
}
// @lc code=end

