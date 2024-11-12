package com.saar.datastructure.inteviewQuestion;

import com.saar.datastructure.list.CustomLinkedList;
import com.saar.datastructure.list.Node;

import java.util.ArrayList;
import java.util.Arrays;
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
        // getNodeInstance(Arrays.asList(1,3,4,4,5,6)).show();

        CustomLinkedList mergeLinkedList = new CustomLinkedList();
        CustomLinkedList mergeLinkedList1 = new CustomLinkedList();

        mergeLinkedList.addList(Arrays.asList(1, 3, 4, 6, 10, 11));
        mergeLinkedList1.addList(Arrays.asList(2, 5, 7, 8, 9,12,13));
        System.out.println("Node a " + mergeLinkedList.toString());
        System.out.println("Node b" + mergeLinkedList1.toString());
        System.out.println("List merged ... ");
        System.out.println(show(merged(mergeLinkedList.getHead(), mergeLinkedList1.getHead())));
    }

    private static Node merged(Node a, Node b) {
        if (a == null) return b;
        else if (b == null) return a;
        else if (a.getId() <= b.getId()) {
            a.setNext(merged(a.getNext(),b));
            System.out.println("a.next "+a.toString());
            return a;
        } else {
            b.setNext(merged(a, b.getNext()));
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
            str.append(node.getId()).append(", ");
            node = node.getNext();
        }
        return str.append("]").toString();
    }

}