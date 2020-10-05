package com.saar.inteviewQuestion;

import java.util.List;

public class MaxProduct {

    int max = Integer.MIN_VALUE;
    int i = 1;

    public int getMaxProduct(List<Integer> list) {
        list.forEach(integer -> {
            i = i * integer;
            if (i == 0) {
                max = 0;
                return;
            }
            if (max<i)max = i;
        });
        return max;
    }
    public static void main(String[] args) {
        MaxProduct maxProduct = new MaxProduct();
        System.out.println(maxProduct.getMaxProduct(List.of(-2,-3,4,-1,-2,1,5,-3)));

    }


}
