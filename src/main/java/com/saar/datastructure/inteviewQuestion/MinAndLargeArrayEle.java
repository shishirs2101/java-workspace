package com.saar.datastructure.inteviewQuestion;

import java.util.Arrays;
import java.util.List;

public class MinAndLargeArrayEle {


    public void findMinAndMaxEle(List<Integer> list) {
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        if (null == list || list.isEmpty()) return;
        for (Integer integer : list) {

            if (min >= integer) min = integer;
            if (max <= integer) max = integer;
        }
        System.out.println("Min and Max element are " + min + ", " + max);
    }


    public static void main(String[] args) {
        MinAndLargeArrayEle minAndLargeArrayEle = new MinAndLargeArrayEle();
        minAndLargeArrayEle.findMinAndMaxEle(Arrays.asList(0, 3, 4, 5, 7, 12, 5, 34, 45, -10, 343));
        minAndLargeArrayEle.findMinAndMaxEle(Arrays.asList(45));
    }
}
