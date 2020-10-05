package com.saar.inteviewQuestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MergeShortedArray {
    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();
    List<Integer> merged = new ArrayList<>();
    int i = 0, j = 0;

    public void merge(int i, int j) {
        this.i = i;
        this.j = j;
        if (i >= a.size() || j >= b.size()) return;
        else if (a.get(i) >= b.get(j)) {
            merged.add(b.get(j));
            j += 1;
        } else {
            merged.add(a.get(i));
            i += 1;
        }
        merge(i, j);
    }

    public List<Integer> getShortedArray() {
        merge(i, j);
        System.out.println(i + "-" + j);
        while (i < a.size()) {
            merged.add(a.get(i));
            i++;
        }
        while (j < b.size()) {
            merged.add(b.get(j));
            j++;
        }
        return merged;
    }

    public static void main(String[] args) {
        // getNodeInstance(List.of(1,3,4,4,5,6)).show();

        MergeLinkedList mergeLinkedList = new MergeLinkedList();
        MergeLinkedList mergeLinkedList1 = new MergeLinkedList();

        mergeLinkedList.addList(List.of(1, 3, 4, 6, 10, 11));
        mergeLinkedList1.addList(List.of(2, 5, 7, 8, 9,12,13));
        System.out.println("Node a " + mergeLinkedList.show());
        System.out.println("Node b" + mergeLinkedList1.show());
        System.out.println("List merged ... ");
        System.out.println(show(merged(mergeLinkedList.head, mergeLinkedList1.head)));
    }

    private static Node merged(Node a, Node b) {
        if (a == null) return b;
        else if (b == null) return a;
        else if (a.id <= b.id) {
            a.next = merged(a.next, b);
            System.out.println("a.next "+a.toString());
            return a;
        } else {
            b.next = merged(a, b.next);
            System.out.println("b.next "+b.toString());
            return b;
        }
    }

    public static Node getMergedList(Node a, Node b) {
        return merged(a, b);
    }

    public static String show(Node node) {
        StringBuilder str = new StringBuilder("[");
        while (node != null) {
            str.append(node.id).append(", ");
            node = node.next;
        }
        return str.append("]").toString();
    }

}

class MergeLinkedList {
    Node head = null;

    public void addList(List<Integer> list) {
        list.forEach(integer -> add(integer));
    }

    public void add(Integer id) {
        if (head == null) head = new Node(id);
        else {
            add(head).next = new Node(id);
        }
    }

    private Node add(Node node) {
        if (node.next == null) return node;
        return add(node.next);
    }

    public String show() {
        Node node = head;
        StringBuilder str = new StringBuilder("[");
        while (node != null) {
            str.append(node.id).append(", ");
            node = node.next;
        }
        return str.append("]").toString();
    }
}

class Node {
    Integer id;
    Node next = null;

    Node() {
    }

    Node(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", next=" + next +
                '}';
    }
}