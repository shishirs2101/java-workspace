package com.saar.datastructure.list;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class CustomLinkedListTest extends TestCase {

    CustomLinkedList customLinkedList = new CustomLinkedList();

    public void testAddList() {
        customLinkedList.addList(Arrays.asList(1,3,4,5,6,7,7,8));
        System.out.println(customLinkedList.toString());
    }
}