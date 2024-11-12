package com.saar.practice;

import java.util.Scanner;

public class BlockMerge {

    // Method to calculate the number of merges required
    public static int numberOfMerges(int N) {
        // You need N - 1 merges to reduce N blocks to 1 block
        return N - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of blocks
        System.out.print("Enter the number of blocks (N): ");
        int N = sc.nextInt();

        // Calculate and display the number of merges
        System.out.println("Number of merges required: " + numberOfMerges(N));

        sc.close();
    }
}
