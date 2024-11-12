package com.saar.datastructure.inteviewQuestion;


/**
 * If string aaaabbaaa
 * out = aaaa
 * */
public class LargeStringSegment {
    public static String segment(String str){
        if (str.length()<= 1) return "";
        long startTime = System.currentTimeMillis();
        String largeChar = "";
        int i=0;
        int j =0;
        for(;i< str.length();){

            char charAtI = str.charAt(i);
            char charAtJ = str.charAt(j);
            StringBuilder strb = new StringBuilder();
            while(charAtI == charAtJ){
                strb.append(charAtI);
                j = j+1;
                charAtJ = str.charAt(j);

            }

            if (largeChar.length() < strb.length())
                largeChar = new String(strb);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time "+ (endTime - startTime));
        return largeChar;
    }
    public static void main(String[] args) {
        System.out.println(LargeStringSegment.segment("aabbbbbbcc"));
        System.out.println(LargeStringSegment.segment("a"));
        System.out.println(LargeStringSegment.segment(""));
        System.out.println(LargeStringSegment.segment("abbbbbddddddddddbbbbbbbbbbbbbbbbbdddddddqqqqqqqqaaaaaakkkkkkkiiiiicccccccbbbbbbaaaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }


}


