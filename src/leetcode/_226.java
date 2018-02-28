package Algorithm.leetcode;

import sun.reflect.generics.tree.Tree;

public class _226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.right);
        TreeNode right= invertTree(root.left);
        root.left=left;root.right=right;
        return root;
    }


    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
