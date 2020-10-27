package com.saar.datastructure.inteviewQuestion;

public class Fib {


    public static int getSumOfFib(int n) {
        if (n == 0) return 1;
        return n + getSumOfFib(n - 1);

    }


    public static int printFib(int n) {
        int count = 0;
        if (n == 0) {
            System.out.println("n="+1);
            return 1;
        }
        count = n + printFib(n - 1);
        System.out.println("n=" + n);
        return count;
    }

    public static void main(String[] args) {
        //  1+1+2+3+4+5 =16
        System.out.println("result " + getSumOfFib(5));
        System.out.println("result " + printFib(5));
    }


}
