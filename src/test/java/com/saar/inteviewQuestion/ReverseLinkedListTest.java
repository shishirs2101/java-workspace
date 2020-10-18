package com.saar.inteviewQuestion;

import com.saar.inteviewQuestion.list.CustomLinkedList;
import junit.framework.TestCase;

import java.util.List;

public class ReverseLinkedListTest extends TestCase {

    public void testRecursionMethod() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.addList(List.of(1, 2, 3, 4, 5, 6));
        CustomLinkedList linkedList = reverseLinkedList.recursionMethod(customLinkedList);
        assertTrue(List.of(6,5,4,3,2,1).equals(linkedList.toList()));
    }

    public void testGetReverseListWithoutRecursion() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.addList(List.of(1, 2, 3, 4, 5, 6));
        CustomLinkedList reverseListWithoutRecursion = reverseLinkedList.getReverseListWithoutRecursion(customLinkedList);
        assertTrue(List.of(6,5,4,3,2,1).equals(reverseListWithoutRecursion.toList()));
    }

    public void testGetTailRecursiveList() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.addList(List.of(1, 2, 3, 4, 5, 6));
        CustomLinkedList tailRecursiveList = reverseLinkedList.getTailRecursiveList(customLinkedList);
        assertTrue(List.of(6,5,4,3,2,1).equals(tailRecursiveList.toList()));
    }
}