package com.saar.datastructure.inteviewQuestion;

import com.saar.datastructure.list.CustomLinkedList;
import com.saar.datastructure.list.Node;

import java.util.List;

public class ReverseLinkedList {


    //Reversing linked list using recursion
    public CustomLinkedList recursionMethod(CustomLinkedList linkedList) {

        if (linkedList.isEmpty()) return null;
        linkedList.setHead(recReverseLinkedList(linkedList.getHead()));
        return linkedList;
    }

    private Node recReverseLinkedList(Node node) {
        CustomLinkedList newCustomLinkedList = new CustomLinkedList();
        if (node.getNext() == null) return node;
        newCustomLinkedList.setHead(recReverseLinkedList(node.getNext()));
        node.getNext().setNext(node);
        node.setNext(null);
        return newCustomLinkedList.getHead();
    }


    //Reverse linked list using temp varialbe
    public CustomLinkedList getReverseListWithoutRecursion(CustomLinkedList linkedList) {
        linkedList.setHead(reverseList(linkedList.getHead()));
        return linkedList;
    }

    private Node reverseList(Node node) {
        Node prev = null;
        Node current = node;
        Node next;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }


    //Tail recursive to reversed the linked list , simple version of recursionMethod

    public CustomLinkedList getTailRecursiveList(CustomLinkedList customLinkedList) {

        customLinkedList.setHead(tailRecursive(customLinkedList.getHead(), null));
        return customLinkedList;
    }

    private Node tailRecursive(Node current, Node prev) {
        if (current == null) return null;
        if (current.getNext() == null) {
            current.setNext(prev);
            return current;
        }
        Node next = current.getNext();
        current.setNext(prev);
        return tailRecursive(next,current);
    }


    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.addList(List.of(1, 2, 3, 4, 5, 6));
        //reverseLinkedList.recursionMethod(customLinkedList);
        //reverseLinkedList.getReverseListWithoutRecursion(customLinkedList);
        reverseLinkedList.getTailRecursiveList(customLinkedList);

        System.out.println(customLinkedList.toString());
    }
}
