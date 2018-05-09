package com.algorithms.practice1.dynamic_programming;

public class LongestCommonSubsequence {

    private int lcs(String x, String y, int m, int n) {
        int[][] c = new int[m+1][n+1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (x.charAt(i) == y.charAt(j)) {
                    c[i + 1][j + 1] = 1 + c[i][j];
                } else {
                    c[i + 1][j + 1] = Math.max(c[i][j + 1], c[i + 1][j]);
                }
            }
        }
        return c[m][n];
    }

    public static void main(String[] args) {
        String x = "AAAA";
        String y = "AAAA";
        LongestCommonSubsequence subsequence = new LongestCommonSubsequence();
        System.out.println(subsequence.lcs(x, y, x.length(), y.length()));
    }
}
