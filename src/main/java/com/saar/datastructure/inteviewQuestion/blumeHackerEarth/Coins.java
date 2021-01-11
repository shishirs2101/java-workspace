package com.saar.datastructure.inteviewQuestion.blumeHackerEarth;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Find the shortest "sub string" which contains all type character present in string.
 * e.g:  [asdfkjeghfalawefhaef]
 * distinct character in string: [a, d, e, f, g, h, j, k, l, s, w] = 11
 * shortest substring  = sdfkjeghfalaw
 */
public class Coins {
    private static final Set<Character> distinctChar = new HashSet<>();
    private static final Set<Character> visitedDisChar = new HashSet<>();
    private static String subString = "";
    private static boolean resultFound = false;


    public static void main(String[] args) {
        processSubString("asdfkjeghfalawefhaef");
        System.out.println(subString + " : " + subString.length());
        processSubString("aaaaaaaaaaaaaaaaaaaaaabaaaaaaa");
        System.out.println(subString + " : " + subString.length());
        processSubString("aaaaaaaaaaaaaaaaaaaab");
        System.out.println(subString + " : " + subString.length());
        processSubString("ab");
        System.out.println(subString + " : " + subString.length());
        processSubString("a");
        System.out.println(subString + " : " + subString.length());
        processSubString("abcedfghizklmnopqrstuvwxyz");
        System.out.println(subString + " : " + subString.length());
        processSubString("zzzzzzsssssaaaaabcdbbbdcd");
        System.out.println(subString + " : " + subString.length());
        processSubString("aaaaaaabcdbbbdcd");
        System.out.println(subString + " : " + subString.length());
    }

    private static void processSubString(String str) {
        clear();
        if (str.length() == 1) {
            subString = str;
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            distinctChar.add(str.charAt(i));
        }
        int i = 0;
        int startPoint = 0;

        for (;i < str.length(); ) {
            final char c = str.charAt(i);
            visitedDisChar.add(c);
            if (visitedDisChar.size() == distinctChar.size()) {
                final String substring = str.substring(startPoint, i + 1);
                if (substring.length() > 1)
                    subStrings(substring);
                if (resultFound) break;
                else subString = substring;
                startPoint++;
                i = startPoint;
            } else i++;

        }

    }

    private static void subStrings(String str) {

        int start = 0;
        int end = str.length();
        for (int i = 1; i < end; i++) {
            final String strSubString = str.substring(i, end);
            if (!strSubString.contains(String.valueOf(str.charAt(start)))) {
                subString = str.substring(start, end);
                break;
            } else {
                start++;
            }
        }
        resultFound = true;
    }

    private static void clear() {
        subString = null;
        distinctChar.clear();
        visitedDisChar.clear();
    }
}
