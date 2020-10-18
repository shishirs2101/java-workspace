package com.saar.inteviewQuestion;

import com.saar.inteviewQuestion.list.CustomLinkedList;
import junit.framework.TestCase;

import java.util.LinkedList;
import java.util.List;


public class LastNthPostOfListTest extends TestCase {


    public void testgetNthPosSolution2() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        assertEquals(999, LastNthPostOfList.getNthPosSolution2(1, list));
    }


    public void testGetRecursiveNthPos() {
        LastNthPostOfList.addList(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        assertEquals(8, LastNthPostOfList.getRecursiveNthPos(1));
    }


    public void testGetRecursiveNthPos2() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        LastNthPostOfList.addList(list);
        assertEquals(997, LastNthPostOfList.getRecursiveNthPos(3));
    }

    public void testGetNthPosSolution() {
        assertEquals(8, LastNthPostOfList.getNthPosSolution2(1, List.of(1, 2, 3, 4, 5, 6, 7, 8)));
    }

}