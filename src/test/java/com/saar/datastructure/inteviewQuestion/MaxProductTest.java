package com.saar.datastructure.inteviewQuestion;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class MaxProductTest extends TestCase {

    public void testGetMaxProduct() {
        MaxProduct maxProduct = new MaxProduct();
        assertEquals(maxProduct.getMaxProduct(Arrays.asList(-2,-3,4,-1,-2,1,5,-3)),240);
        assertEquals(maxProduct.getMaxProduct(Arrays.asList(-2,-3,4,-1,-2,1,5,-3,0)),0);
    }
}