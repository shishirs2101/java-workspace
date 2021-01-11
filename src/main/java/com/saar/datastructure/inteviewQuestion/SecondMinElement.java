package com.saar.datastructure.inteviewQuestion;

import java.util.List;

public class SecondMinElement {

    private static int secMinEelement(List<Integer> list){
        Integer firstMin = Integer.MAX_VALUE;
        Integer secMin = Integer.MAX_VALUE;

        for (Integer ele :list) {
            if (secMin > ele){
                if (firstMin > ele ){
                    secMin = firstMin;
                    firstMin = ele;
                }else  secMin = ele;
            }
        }

        return secMin;

    }
    public static void main(String[] args) {
        System.out.println(SecondMinElement.secMinEelement(List.of(3,1,5,7,6,10,2,6,0)));
        System.out.println(SecondMinElement.secMinEelement(List.of(5,8,6,10)));
        System.out.println(SecondMinElement.secMinEelement(List.of(3,0,5,7,-6,-5,0)));
    }
}
