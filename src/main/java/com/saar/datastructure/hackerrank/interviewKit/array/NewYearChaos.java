package com.saar.datastructure.hackerrank.interviewKit.array;

import java.util.Arrays;
import java.util.Scanner;

public class NewYearChaos {

    /*
    It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by  from  at the front of the line to  at the back.
    Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if  and  bribes , the queue will look like this: .
    Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!


    Input:
    3
    5
    2 1 5 3 4
    5
    2 5 1 3 4
    8
    1 2 5 3 7 8 6 4
    output:
    3
    Too chaotic
    7
     */


    static void minimumBribes(int[] q) {
        bribe(q);
    }

    static void bribe(int[] q) {
        int count = 0;
        int firsPos = 1;
        int secondPos = 2;
        int thirdPos = 3;
        boolean flag = true;

        for (int i=0;i<q.length;i++){
            if (q[i]== firsPos){
                firsPos = secondPos;
                secondPos =thirdPos;
                ++thirdPos;
            }else if (q[i] == secondPos){
                count++;
                secondPos = thirdPos;
                ++thirdPos;
            }else if (q[i] == thirdPos){
                thirdPos++;
                count+=2;
            }else flag = false;
        }
        if (flag){
            System.out.println(count);
        }else System.out.println("Too chaotic");
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }


}
