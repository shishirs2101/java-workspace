package com.saar.datastructure.inteviewQuestion.onetrustHackerRank;


public class Solution1 {

    public static void compareString(String str1, String str2) {
        int count = 0;
        int j = 0;
        int i = 0;
        for (; i < str2.length(); ) {
            if (str1.length() < i) {
                count = count+str2.length()-i;
                break;
            } else if (str2.charAt(i) == str1.charAt(j)) {
                j++;
            } else {
                count++;
            }
            i++;
        }
        if (str1.length() > str2.length()) {
            count = count + str1.length() - i;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        String str = "shishir";
        String str2 = "shirshirkdf";   //4

        String str3 = "shirshr";  //2
        String str4 = "shi";    //4
        String str5 = "shisdfshir";  //3
        String str6 = "sak";    //6
        String str7 = "shisshirk";    //2
        String str8 = "sdffdfr";    //5
        compareString(str, str2);
        compareString(str, str3);
        compareString(str, str4);
        compareString(str, str5); //wrong
        compareString(str, str6);
        compareString(str, str7);
        compareString(str, str8); //wrong

    }

}
