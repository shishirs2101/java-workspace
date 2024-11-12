package com.saar.practice;

import java.util.Arrays;

public class SearchElement {
    public static int[] searchIdx(int [][]mat , int N , int M, int target){
        int i =0;
        int row = -1;
        while(i < N ){
            int lastEle = mat[i][M-1];
            if(lastEle >= target){
                row = i;
                break;
            }
            i++;
        }

        int column = 0;
        while(column++ < M-1){
            if(target == mat[row][column])
                break;
        }

        int [] result = new int [2];
        result[0] = row;
        result[1] = column;

        return result;
    }

    public static void main(String[] args) {
        int [][] mat = {{1, 2, 3, 4}, {5,6, 7, 8 }, {9,10, 11, 12}};
        int[] result = searchIdx(mat, 3,4,8);
        System.out.println(Arrays.toString(result));
    }
}

