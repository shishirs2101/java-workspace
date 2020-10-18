package com.saar.inteviewQuestion;

import java.util.List;

public class FindTwoMinElement {
    static int firstMinElement = Integer.MAX_VALUE;
    static int secondMinElement = Integer.MAX_VALUE;

    public static int getSecondMinEle(List<Integer> list) {

        list.forEach(integer -> {
            if (firstMinElement > integer) {
                firstMinElement = integer;
            }
            if (secondMinElement > firstMinElement) {
                int temp = secondMinElement;
                secondMinElement = firstMinElement;
                firstMinElement = temp;
            }
        });
        return secondMinElement;
    }
}
