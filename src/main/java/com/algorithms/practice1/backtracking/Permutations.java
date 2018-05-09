/**
 * @author Rohith Raj 3/18/2018
 */
package com.algorithms.practice1.backtracking;

public class Permutations {

    private static void swap(StringBuilder s, int start, int end) {
        char temp = s.charAt(start);
        s.setCharAt(start, s.charAt(end));
        s.setCharAt(end, temp);
    }

    private static void permutation(StringBuilder s, int start, int end) {
        if (start == end) {
            System.out.println(s);
        }

        int index;

        for (index = start; index <= end; index++) {
            swap(s, start, index);
            permutation(s, start + 1, end);
            swap(s, start, index);
        }
    }

    public static void main(String[] args) {
        String s = "1234";
        permutation(new StringBuilder(s), 0, s.length() - 1);
    }
}
