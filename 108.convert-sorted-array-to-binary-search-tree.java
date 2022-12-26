import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length-1);
    }

    public TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end){
        if(start > end) return null;
        int mid = start + (end-start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBSTHelper(nums, start, mid-1);
        node.right = sortedArrayToBSTHelper(nums, mid+1, end);
        return node; 
    }
}
// @lc code=end

