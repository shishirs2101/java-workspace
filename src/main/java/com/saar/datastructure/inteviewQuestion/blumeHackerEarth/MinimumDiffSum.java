package com.saar.datastructure.inteviewQuestion.blumeHackerEarth;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * rearrange the array to
 * Calculate the min sum from difference of consecutive element
 * e.g  [1,2,3,3,4,1]
 * shot array [1,1,2,3,3,4] = |1-1| + |1-2| + |2-3| + |3-3| + |3-4| = 0+1+1+0+1= 3
 */
public class MinimumDiffSum {
    public static void main(String[] args) {
      List<Integer> list =   new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(1);
        }};


        System.out.println(minSum(list));

        list =   new ArrayList<>(){{
            add(5);
            add(1);
            add(3);
            add(7);
            add(3);
        }};

        System.out.println(minSum(list));
    }

    private static int minSum(List<Integer> list) {
        Collections.sort(list);
        int sum = 0;
        int idx = 0;
        for (; idx < list.size()-1; ) {
            int ele = list.get(idx);
            sum += Math.abs(ele - list.get(idx + 1));
            ++idx;
        }

        return sum;
    }
}
