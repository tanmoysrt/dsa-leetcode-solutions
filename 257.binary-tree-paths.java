import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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

 /*
  * 1. If root == null retun
  * 2. If root.left == null and root.right == null , add root.val to currentpath and add to result
  * 3. call for right and left nodes with currentpath + -> + root.val if 2nd condition not true
  */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        helper(root,"" ,result);
        return result;
    }

    public void helper(TreeNode root, String currentPath, List<String> resultStore){
        if(root == null) return;
        if(root.left == null && root.right == null){
            String res = currentPath+"->"+Integer.toString(root.val);
            if(res.startsWith("->")) res = res.substring(2);
            resultStore.add(res);
            return;
        }
        helper(root.left, currentPath+"->"+Integer.toString(root.val), resultStore);
        helper(root.right, currentPath+"->"+Integer.toString(root.val), resultStore);
    }
}
// @lc code=end

