/**
 * @author Rohith Raj 3/18/2018
 */
package com.algorithms.practice1.dynamic_programming;

public class LongestPalindromicSubstring {

    static int startIndex, endIndex, maxLen = -1;
    private static int lps(String s, int n) {
        if (s != null) {
            boolean[][] arr = new boolean[n][n];
            for (int l = 0; l < n; l++) {
                for (int i = 0, j = i + l; i < n && j < n; i++, j++) {
                    if (i == j || (j - i == 1 && s.charAt(i) == s.charAt(j))) {
                        arr[i][j] = true;
                    } else if (s.charAt(i) == s.charAt(j)) {
                        arr[i][j] = arr[i + 1][j - 1];
                    } else {
                        arr[i][j] = false;
                    }
                }
            }

//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//                System.out.println();
//            }

            for (int l = n; l > 0; l--) {
                for (int i = 0, j = i + l - 1; i < n && j < n; i++, j++) {
                    if (arr[i][j]) {
                        startIndex = i;
                        endIndex = j;
                        return l;
                    }
                }
            }
        }
        return 0;
    }

    private static int lpsNoSpace(String s, int n) {

        for (int i = 1; i < n; i++) {
            int low = i - 1, high = i;
            //util(low, high, n, maxLen, s);
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLen) {
                    maxLen = high - low + 1;
                    startIndex = low;
                }
                low--;
                high++;
            }
            low = i - 1;
            high = i + 1;
            //util(low, high, n, maxLen, s);
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxLen) {
                    maxLen = high - low + 1;
                    startIndex = low;
                }
                low--;
                high++;
            }
        }
        return maxLen;
    }

    private static void util(int low, int high, int n, int maxLen, String s) {
        while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
            if (high - low + 1 > maxLen) {
                maxLen = high - low + 1;
                startIndex = low;
            }
            low--;
            high++;
        }
    }

    public static void main(String[] args) {
        String s = "tattarrattat";
        System.out.println(lps(s, s.length()));
        System.out.println(startIndex);
        System.out.println(endIndex);

        System.out.println(lpsNoSpace(s, s.length()));
    }
}
