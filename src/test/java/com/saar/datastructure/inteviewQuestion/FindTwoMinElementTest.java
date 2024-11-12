package com.saar.datastructure.inteviewQuestion;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class FindTwoMinElementTest extends TestCase {

    public void testGetSecondMinEle() {
        assertEquals(-2, FindTwoMinElement.getSecondMinEle(Arrays.asList(4,3,0,5,-1,3,-2)));
    }
}