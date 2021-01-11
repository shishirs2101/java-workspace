package com.saar.datastructure.inteviewQuestion;

import java.util.List;

public class SecondHighestElement {
    private static int secondHighestElement(List<Integer> list){
        int fistMax =Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (Integer ele :list) {
            if (secMax < ele ){
                if (fistMax < ele){
                    secMax = fistMax;
                    fistMax = ele;
                }else secMax = ele;
            }
        }
        return secMax;
    }


    public static void main(String[] args) {
        System.out.println(SecondHighestElement.secondHighestElement(List.of(3,0,5,7,6,1,2,6,0)));
        System.out.println(SecondHighestElement.secondHighestElement(List.of(5,8,6,10)));
        System.out.println(SecondHighestElement.secondHighestElement(List.of(3,0,5,7,-6,-5,0)));
    }
}
