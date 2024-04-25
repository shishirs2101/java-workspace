//package com.saar.datastructure.inteviewQuestion;
//
//import org.apache.log4j.Logger;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class PairSumOfArray {
//    Logger logger = Logger.getLogger(PairSumOfArray.class);
//    //Get count of pair element which sum is equal to given n key.
//    ArrayList<Integer> pairElement;
//    int count;
//
//    public int getPairCount(List<Integer> list, int n) {
//        Long startTime = System.nanoTime();
//        count = 0;
//        pairElement = new ArrayList<>();
//        list.forEach(integer -> {
//            int secondEle = n - integer;
//            if (pairElement.contains(secondEle)) {
//                count++;
//            }
//            pairElement.add(integer);
//        });
//        logger.info("Time Taken  " + (System.nanoTime() - startTime));
//        return count;
//    }
//
//    public int getPairElementCount(List<Integer> list, int n) {
//        long startTime  = System.nanoTime();
//        List<List<Integer>> result = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        List<Integer> list1 = new ArrayList<>();
//
//        for (Integer ele : list) {
//            if (map.containsKey(ele)) {
//                list1.add(ele);
//                list1.add(map.get(ele));
//                if (!result.contains(ele)) {
//                    result.add(list1);
//                }
//            } else {
//                map.put(n - ele, ele);
//            }
//        }
//        logger.info("Time Taken  " + (System.nanoTime() - startTime));
//
//        return result.size();
//    }
//
//    public static void main(String[] args) {
//        PairSumOfArray pairSumOfArray = new PairSumOfArray();
//        int pairCount = pairSumOfArray.getPairCount(List.of(1, 7, 1, 3, 5, 9, -1, 9, -13), 8);
//        System.out.println(pairCount);
//        int pairCount1 = pairSumOfArray.getPairElementCount(List.of(1, 7, 1, 7, 3, 5, 9, -1, 9, -13), 8);
//        System.out.println(pairCount1);
//        int pairCount2 = pairSumOfArray.getPairElementCount(List.of(1, 3, 3, 3, 3, 1, 2, 1, 2,5,5,5,-1,-1), 4);
//        System.out.println(pairCount2);
//        int pairCount3 = pairSumOfArray.getPairElementCount(List.of(1, 3, 3, 3, 3), 4);
//        System.out.println(pairCount3);
//        int pairCount4 = pairSumOfArray.getPairCount(List.of(1, 3, 3, 3, 3), 4);
//        System.out.println(pairCount4);
//
//
//    }
//}
