package com.saar.datastructure.inteviewQuestion;

public class Btree {

    Node root = null;
    public void  insert(int key){
        if(root == null) root = new Node(key);
        else insert(root, key);
    }
    private Node insert(Node node, int key){
        if (node == null )return new Node(key);
        if (key < node.key)
            node.left = insert(node.left,key);
        else
            node.right = insert(node.right, key);
        return node;
    }

    private int count(Node node){
        System.out.println(node);
        if(node == null) return 0;
        return count(node.left) + count(node.right);

    }

    public int size(){
        return count(root);
    }

    public static void main(String[] args) {
        Btree btree = new Btree();
        btree.insert(11);
        btree.insert(12);
        btree.insert(13);
        btree.insert(14);
        btree.insert(15);
        btree.insert(16);
        btree.insert(17);
        System.out.println(btree.size());
    }

}
class Node {
    int key;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Node {" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
