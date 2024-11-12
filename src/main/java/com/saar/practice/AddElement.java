package com.saar.practice;


/**
 * Sum of the integer element, util result is in single digit
 * e.g 123456
 * 1+2+3+4+5+6 = 21
 * then add 2 +1 = 3
 * result  =  3
 * */
public class AddElement {
    public static void main(String[] args) {
        System.out.println(rSingleDigitSum(123456));
    }

    public static int addElement(long num){
        int sum = 0;
        long i =0;
        while ((i = num%10) != 0){
            sum += (int) i;
            num /= 10;
        }
        return sum;
    }

    public static int singleDigitSum(long num){
        int sum = addElement(num);
        while(sum/10 != 0){
            sum = addElement(sum);
            if (sum/10 == 0) return sum;
        }
        return 0;
    }

    // Method 2 with recursion
    public static int rAddElement(int num){
        if(num == 0) return num;
        return num%10 + rAddElement(num/10);
    }
    public static int rSingleDigitSum(int num){
        int sum = rAddElement(num);
        return  (sum/10 ==0 )? sum : rSingleDigitSum(sum);
    }
}
