package com.saar.datastructure.tree;

public class BTStructure {
    public TreeNode root;

    public BTStructure(int  id) {
        root = new TreeNode(id);
    }

    public BTStructure() {
        root=null;
    }

    @Override
    public String toString() {
        return "BTStructure{" +
                "root=" + root.toString() +
                '}';
    }

    public void traversePreOrder(TreeNode treeNode){
        if (treeNode == null)return;
        System.out.println(treeNode.getId());
        traversePreOrder(treeNode.getLeft());
        traversePreOrder(treeNode.getRight());
    }

    public void traverseInOrder(TreeNode treeNode){
        if (treeNode == null)return;
        traverseInOrder(treeNode.getLeft());
        System.out.println(treeNode.getId());
        traverseInOrder(treeNode.getRight());
    }
    public void traversePostOrder(TreeNode treeNode){
        if (treeNode == null)return;
        traversePostOrder(treeNode.getLeft());
        traversePostOrder(treeNode.getRight());
        System.out.println(treeNode.getId());
    }

}


