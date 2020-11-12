package com.saar.datastructure.inteviewQuestion.onetrustHackerRank;

import java.io.*;
import java.util.*;



public class Solution {
    public static void main(String[] args) throws IOException {

        System.out.println(maxTrailingh(List.of(5,3,6,7,4)));
        System.out.println(maxTrailingh(List.of(4,3,2,1)));
        System.out.println(maxTrailingh(List.of(5,3,4,1)));

    }
    public static int maxTrailingh(List<Integer> levels) {

        int lowestLevel = Integer.MAX_VALUE;
        int maxDIff = -1;

        for (Integer level : levels) {

            if (lowestLevel > level) {
                lowestLevel = level;
            } else if (lowestLevel < level) {
                int levelDif = level - lowestLevel;
                if (maxDIff < levelDif) maxDIff = levelDif;
            }
        }
        return maxDIff;
    }
}

