package com.saar.datastructure.inteviewQuestion;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MergeShortedArrayTest extends TestCase {

    @Test
    public void testGetShortedArray() {
        MergeShortedArray mergeShortedArray  = new MergeShortedArray();
        List<Integer> resultList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 14, 15, 16, 18, 20);
        mergeShortedArray.a.addAll(Arrays.asList(1,2,3,4,12,15,16,20));
        mergeShortedArray.b.addAll(Arrays.asList(5,6,7,8,9,10,11,12,14,18));
        assertEquals(resultList,mergeShortedArray.getShortedArray());
    }

}