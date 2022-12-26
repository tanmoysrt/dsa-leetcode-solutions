import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(isBalanced(root.left) == false) return false;
        if(isBalanced(root.right) == false) return false;

        int left_h = height(root.left);
        int right_h = height(root.right);
        if(Math.abs(left_h-right_h) <= 1) return true;
        return false;
    }

    public int height(TreeNode root){
        if(root == null) return 0;
        int left_h = height(root.left);
        int right_h = height(root.right);
        return Math.max(left_h, right_h)+1;
    }
}
// @lc code=end

