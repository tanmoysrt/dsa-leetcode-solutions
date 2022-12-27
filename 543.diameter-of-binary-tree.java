import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
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
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        getMaxDepth(root);
        return max;
    }

    public int getMaxDepth(TreeNode root){
        if(root == null) return 0;
        int left = getMaxDepth(root.left);
        int right = getMaxDepth(root.right);
        max = Math.max(max, left+right);
        return Math.max(left, right)+1;
    }
}
// @lc code=end

