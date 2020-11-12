package com.saar.datastructure.geeksforgeeks;

import com.saar.datastructure.tree.BTStructure;
import com.saar.datastructure.tree.TreeNode;

public class CheckFullBinaryTree {

    public static void main(String[] args) {
        BTStructure btStructure = new BTStructure(1);
        btStructure.root.setLeft(new TreeNode(2));
        btStructure.root.getLeft().setLeft(new TreeNode(4));
        btStructure.root.getLeft().setRight(new TreeNode(5));
        btStructure.root.setRight(new TreeNode(3));
        btStructure.root.getRight().setLeft(new TreeNode(6));

        //System.out.println(btStructure.toString());
        btStructure.traversePreOrder(btStructure.root);

        CheckFullBinaryTree checkFullBinaryTree = new CheckFullBinaryTree();
        System.out.println(checkFullBinaryTree.validateFullBT(btStructure));
    }


    public boolean validateFullBT(BTStructure btStructure) {
        return validateFullBT(btStructure.root);
    }

    private boolean validateFullBT(TreeNode treeNode) {
        if (treeNode == null)
            return true;

        if (treeNode.getLeft() == null && treeNode.getRight() == null)
            return true;
         else if (treeNode.getLeft() != null && treeNode.getRight() != null) {
             return validateFullBT(treeNode.getLeft()) && validateFullBT(treeNode.getRight());
        }
        return false;
    }

}
