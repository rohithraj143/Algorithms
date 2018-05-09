/**
 * @author Rohith Raj 3/31/2018
 */
package com.algorithms.test;

public class Test1 {

    public static String convert(String s, int numRows) {
        int nextIndex = 2 * (numRows - 1), j, k = 0;
        int n = s.length();
        String res = "";

        for (int i = 0; i < numRows; i++) {
            j = i;
            if (j == 0 || j == numRows - 1) {
                while (j < n) {
                    res += s.charAt(j);
                    j += nextIndex;
                }
            } else {
                while (j < n) {
                    res += s.charAt(j);
                    j += nextIndex;
                    k = j - 2 * i;
                    if (k < n) {
                        res += s.charAt(k);
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(s.length());
    }

}