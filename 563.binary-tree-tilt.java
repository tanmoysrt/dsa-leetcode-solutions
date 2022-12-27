/*
 * @lc app=leetcode id=563 lang=java
 *
 * [563] Binary Tree Tilt
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
    int sum = 0;
    public int findTilt(TreeNode root) {
        findTiltHelper(root);
        return sum;
    }

    public int findTiltHelper(TreeNode root) {
        if(root == null) return 0;
        int left = findTiltHelper(root.left);
        int right = findTiltHelper(root.right);
        sum = sum + Math.abs(left-right);
        return root.val + left + right;        
    }

}
// @lc code=end

