package com.saar.datastructure.inteviewQuestion;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class MergeShortedArrayTest extends TestCase {

    @Test
    public void testGetShortedArray() {
        MergeShortedArray mergeShortedArray  = new MergeShortedArray();
        List<Integer> resultList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 14, 15, 16, 18, 20);
        mergeShortedArray.a.addAll(List.of(1,2,3,4,12,15,16,20));
        mergeShortedArray.b.addAll(List.of(5,6,7,8,9,10,11,12,14,18));
        assertEquals(resultList,mergeShortedArray.getShortedArray());
    }

}