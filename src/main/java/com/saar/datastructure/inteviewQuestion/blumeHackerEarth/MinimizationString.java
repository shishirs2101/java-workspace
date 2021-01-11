package com.saar.datastructure.inteviewQuestion.blumeHackerEarth;


/**
 * Step to follow to minimized the string ex : aabcccabba
 * step 1: divide the string into 2 parts i.e   aabcc cabba
 * step 2: merge the string cabbaaabcc  and remove the common element("aaa") new string is cabbbcc
 * step 3 in new string remove the common charachter ("bbb") repeat the process until wont get uncommon
 * character.  cacc
 */
public class MinimizationString {
    static int resultStrLen = 0;

    public static void main(String[] args) {
        minimized("aabcccabba");
        System.out.println("aabcccabba := " +resultStrLen);
        minimized("aabccaaaaa");
        System.out.println("aabccaaaaa :="+resultStrLen);
        minimized("aaaaacaba");
        System.out.println( "aaaaacaba :="+ resultStrLen);
        minimized("ab");
        System.out.println("ab :="+resultStrLen);
        minimized("aa");
        System.out.println("aa := "+resultStrLen);
    }

    private static void minimized(String str) {
        resultStrLen = 0;
        if (str.length() < 2) {
            resultStrLen = str.length();
            return;
        }
        int mid = str.length() / 2;
        String firstStr = str.substring(0, mid);
        String secStr = str.substring(mid, str.length());
        minString(secStr, firstStr);

    }

    private static void minString(String firstStr, String secStr) {
        if (firstStr.charAt(firstStr.length() - 1) != secStr.charAt(0)) {
            String str = firstStr + secStr;
            resultStrLen = str.length();
            return;
        }
        int firstLen = firstStr.length();
        char firstChar = firstStr.charAt(firstLen - 1);
        while (firstLen > 0) {
            if (firstStr.charAt(firstLen - 1) == firstChar) --firstLen;
            else break;
        }
        int secLen = 0;
        char secChar = secStr.charAt(secLen);
        while (secLen < secStr.length()) {
            if (secStr.charAt(secLen) == secChar) ++secLen;
            else break;
        }

        if (firstLen == 0 && secLen == 0) resultStrLen = 0;
        else if (firstLen == 0) resultStrLen = secStr.substring(secLen,secStr.length()).length();
        else if (secLen == secStr.length()) resultStrLen = firstStr.substring(0,firstLen).length();
        else {
            minString(firstStr.substring(0, firstLen), secStr.substring(secLen, secStr.length()));
        }

    }
}
