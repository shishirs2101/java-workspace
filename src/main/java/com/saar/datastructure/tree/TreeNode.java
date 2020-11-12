package com.saar.datastructure.tree;

public class TreeNode {
    private int id;
    private TreeNode right;
    private TreeNode left;


    public TreeNode(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "id=" + id +
                ", right=" + right +
                ", left=" + left +
                '}';
    }
}
