package com.saar.practice;

public class LongestPelindrom {

    // Helper method to expand around center and return the length of the palindrome
    private static String expandAroundCenter(String s, int left, int right) {
        // Expand as long as the characters at the left and right are the same
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the palindrome found
        return s.substring(left + 1, right);
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes (single character center)
            String oddPalindrome = expandAroundCenter(s, i, i);
            // Check for even-length palindromes (two character center)
            String evenPalindrome = expandAroundCenter(s, i, i + 1);

            // Update longest palindrome if necessary
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String input = "babad";
        System.out.println("Longest palindrome substring is: " + longestPalindrome(input));
    }

}
