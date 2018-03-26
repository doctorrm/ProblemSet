package Algorithm.leetcode;
/*
Given a binary tree, determine if it is height-balanced.

        For this problem, a height-balanced binary tree is defined as:

        a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
*/

public class _110 {
    public boolean isBalanced(TreeNode root) {
        int res = height(root);
        return res != -1;
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;

        int lH = height(root.left);
        if (lH == -1) return -1;

        int rH = height(root.right);
        if (rH == -1) return -1;

        if (Math.abs(lH - rH) > 1) return -1;

        return Math.max(lH, rH) + 1;
    }
}

//  Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}