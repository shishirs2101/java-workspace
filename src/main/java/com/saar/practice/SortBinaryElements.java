package com.saar.practice;

import java.util.Arrays;

public class SortBinaryElements {
    public static void main(String[] args) {
        int[] arr = new int[] {1,0,0,0,0,1,1,0};
        sortBinartList(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortBinartList(int[] arr){
        int i = 0;
        int j = arr.length -1;
        while (i < j){
            if (arr[i] == 1){
                swap(arr, i, j);
                j--;
            }else if (arr[j] == 0){
                swap(arr, i, j);
                i++;
            }else {
                i++;
                j--;
            }
        }
    }

    private static void swap(int []arr, int idx1, int idx2){
        int temp;
        temp = arr[idx2];
        arr[idx2] = arr[idx1];
        arr[idx1] = temp;
    }
}
