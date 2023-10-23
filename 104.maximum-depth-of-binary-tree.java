/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
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
    // int depth = 0;
    // int res = 0;

    // public int maxDepth(TreeNode root) {
    //     traverse(root);
    //     return res;
    // }

    // void traverse(TreeNode root) {
    //     if (root == null) {
    //         return;
    //     }
    //     depth++;
    //     // leaf node
    //     if (root.left == null && root.right == null) {
    //         res = Math.max(depth, res);
    //     }
    //     maxDepth(root.left);
    //     maxDepth(root.right);
    //     depth--;
    // }
    
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
// @lc code=end

