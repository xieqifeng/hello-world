package com.juvenxu.mvnbook.helloworld.tree;

import java.util.Stack;

public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.left = null;
        q.right = new TreeNode(2);
        System.out.println(new SameTree().isSameTree(p, q));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if ((p != null && q != null) && (p.val == q.val)) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }

}
