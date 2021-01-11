package com.saar.datastructure.inteviewQuestion.AQRCompany;

import java.util.*;

public class ClosesPairOfElement {
    public static void main(String[] args) {
        int [] ar = {3,1,4,1,6,9,10};
        final int[][] results = closestNumbers(ar);
        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < results[i].length; j++) {
                System.out.print(results[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    static int[][] closestNumbers1(int[] numbers) {
        Map<Integer,Integer>numberMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numberMap.containsKey(numbers[i])){

            }else {

            }
        }
        return null;
    }

     //wrong approach
    static int[][] closestNumbers(int[] numbers) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer>numbersList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numbersList.add(numbers[i]);
        }
        Collections.sort(numbersList);

        for (int i = 0; i < numbersList.size() ; i++) {
            if (i ==0 ) {
                final ArrayList<Integer> objects = new ArrayList<>();
                objects.add(i);
                objects.add(i+1);
                resultList.add(objects);
            }
            else{
                int current = numbersList.get(i);
                int prev = numbersList.get(i-1);
                int next =0;
                if (i+1 < numbersList.size())
                 next = numbersList.get(i+1);
                final ArrayList<Integer> objects = new ArrayList<>();
                if (current-prev <  next -current){
                    objects.add(current);
                    objects.add(prev);
                    resultList.add(objects);
                }else {
                    objects.add(current);
                    objects.add(next);
                    resultList.add(objects);
                }
            }
        }
        int [][]result = new int[resultList.size()][2];
        int i =0;
        for (List<Integer> list :resultList) {
            result[i][0] = list.get(0);
            result[i][1] = list.get(1);
            ++i;
        }
        return result;
    }
}
