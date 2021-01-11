package com.saar.datastructure.inteviewQuestion.AQRCompany;

import java.util.Arrays;

public class AddMultidimensionArray {

    /**
     * after:
     * [[14,9,9,16,16],
     *  [2,12,0,5,20],
     *  [1,2,13,12,0],
     *  [20,5,0,15,10],
     *  [16,5,4,4,0],
     *  [1,16,19,2,18]]
     * Output:
     * [[14,-5,9,16,16],
     *  [-12,15,0,5,20],
     *  [-1,-9,13,12,0],
     *  [19,-16,0,15,10],
     *  [-4,4,4,4,0],
     *  [-15,26,19,2,18]]
     * */

   static int[][] matrixSummation(int[][] after) {
        int revEle[] = new int[1000];
        int iIdxEle[] = new int[1000];
        int before[][] = after;
        int s = 0;
        int pos =1;
        for (int i = 0; i < before.length; i++) {
            for (int j = 0; j < before[i].length; j++) {
                if (i == 0 && j == 0) {
                    s = before[i][j];
                    after[i][j] = s;
                    revEle[0] = iIdxEle[0] = s;
                } else if (j == 1) {
                    s=0;
                    for (int k = 0; k < revEle.length && revEle[k] != 0; k++) {
                        s += revEle[k];
                        pos = k+1;
                    }
                    s = before[i][j] - s;
                    if (pos!=0) revEle[pos] =s;
                    after[i][j] = s;
                } else if (i > 0 && j == 0) {
                    s=0;
                    int revPos = pos;
                    for (int k = 0; k < iIdxEle.length && iIdxEle[k] != 0; k++) {
                        s += iIdxEle[k];
                        pos = k+1;
                    }
                    s = before[i][j] - s;
                    iIdxEle[pos] = s;
                    revEle[revPos+1] = s;
                    after[i][j] =s;
                }

            }
        }
        return after;
    }

    public static void main(String[] args) {
        int [][] ar =  {{1,2},{3,4}};
        ar = matrixSummation(ar);
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}

