package com.saar.practice;

public class ShortChar {

    /*** ['b', 'v', 'd', 'a' 'g']
     * ['b', 'v', 'd', 'a' 'g']
     * ['b', 'd','v', 'a', 'g']
     * ['b', 'd','v', 'a', 'g']
     * ['b', 'd','a', 'v', 'g']
     */



    public static void sort(char[] ch){


        for(int i =0; i< ch.length; i++){
            for(int j=0; j< ch.length-1;j++){

                if (ch[j] > ch[j+1]){
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1]  = temp;
                }
            }
        }
        System.out.println(ch);
    }
    public static void main(String[] args) {
        char [] ch = new char[]{'b', 'v', 'd','a', 'g'};
        sort(ch);
    }
}
