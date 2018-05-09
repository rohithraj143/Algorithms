/**
 * @author Rohith Raj 2/26/2018
 */
package com.algorithms.practice1.strings;

public class Palindrome {

    public static boolean isPalindrome(String s, int n) {
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Madam";
        System.out.println(isPalindrome("Madam".toLowerCase(), s.length()));
    }
}
