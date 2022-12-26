import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
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
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, 0, false);
    }

    public int helper(TreeNode root, int currentSum, boolean isLeft){
        if(root == null) return 0;
        if(root.right == null && root.left == null){
            if(isLeft) return currentSum + root.val;
            return 0;
        }
        return helper(root.left, currentSum, true) + helper(root.right, currentSum, false);
    }
}
// @lc code=end

