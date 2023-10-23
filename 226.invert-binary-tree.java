/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
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
    public TreeNode invertTree(TreeNode root) {
        // if (root == null) {
        //     return null;
        // }
        // TreeNode left = invertTree(root.left);
        // TreeNode right = invertTree(root.right);
        // root.left = right;
        // root.right = left;
        // return root;

        traverse(root);
        return root;
    }

    void traverse(TreeNode root) {
        if (root == null)
            return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        traverse(root.left);
        traverse(root.right);
    }
}
// @lc code=end

