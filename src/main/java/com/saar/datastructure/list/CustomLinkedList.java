package com.saar.datastructure.list;

import java.util.LinkedList;
import java.util.List;

public class CustomLinkedList {
    Node head=null;

    public  void add(int id){
        if (head == null) head = new Node(id);
        else {
            add(head).setNext(new Node(id));
        }
    }

    private Node add(Node node){
        if (node.getNext() == null)return node;
        return add(node.getNext());
    }

    public void  addList(List<Integer> list){
        list.forEach(integer -> add(integer));
    }

    public List<Integer>toList(){
        List<Integer>list = new LinkedList<>();
        if (head == null)return list;
        Node temp = head;
        while (temp!= null){
            list.add(temp.getId());
            temp = temp.getNext();
        }
        return list;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        Node temp = head;
        while (temp!= null){
            stringBuilder.append(temp.getId()).append(", ");
            temp = temp.getNext();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean isEmpty(){
        return head == null?true:false;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
