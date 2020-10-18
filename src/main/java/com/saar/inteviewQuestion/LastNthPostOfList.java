package com.saar.inteviewQuestion;

import com.saar.inteviewQuestion.list.CustomLinkedList;
import com.saar.inteviewQuestion.list.Node;

import java.util.List;

public class LastNthPostOfList {

    static int result = Integer.MIN_VALUE;
    static int i = 0;
    static CustomLinkedList customLinkedList = new CustomLinkedList();

    public static void addList(List<Integer> list){
        customLinkedList.addList(list);
    }

    public static int getRecursiveNthPos(int n) {
        getNthPos(customLinkedList.getHead(), n);
        return result;
    }

    private static void getNthPos(Node node, int n) {
        if (node == null) return;
        getNthPos(node.getNext(), n);
        ++i;
        if (i < n) {
            return;
        }
        if (i == n) {
            result = node.getId();
        }
    }

    public static int getNthPosSolution2(Integer n, List<Integer> list) {
        int i = 0;
        int endIndex = 0;
        int idIndex = 0;

        if (n >=list.size())return Integer.MIN_VALUE;

        while (i <= list.size()) {
            if (endIndex++ == n) {
                break;
            }
            i++;
        }
        while (endIndex <= list.size()){
            idIndex++;
            endIndex++;
        }
        if (idIndex >= list.size()) return Integer.MIN_VALUE;
        return list.get(idIndex);
    }

    public static void main(String[] args) {
        System.out.println(getNthPosSolution2(1,List.of(1, 2, 3, 4, 5, 6, 7, 8)));
    }
}
