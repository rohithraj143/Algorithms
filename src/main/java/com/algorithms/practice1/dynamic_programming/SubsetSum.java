package com.algorithms.practice1.dynamic_programming;

public class SubsetSum {

    private boolean hasSubsetSum(int[] set, int n, int sum) {
        boolean[][] T = new boolean[n + 1][sum + 1];
        T[0][0] = true;
        for (int i = 1; i <= n; i++) {
            T[i][0] = true;
            for (int j = 1; j <= sum; j++) {
                int k = set[i - 1];
                if (k > j) {
                    T[i][j] = T[i - 1][j];
                } else {
                    T[i][j] = T[i - 1][j - k] || T[i - 1][j];
                }
            }
        }
        return T[n][sum];
    }

    public static void main(String[] args) {
        int[] set = {6, 2, 3, 1};
        int n = set.length;
        SubsetSum subsetSum = new SubsetSum();
        for (int sum = 0; sum <= 13; sum++) {
            System.out.println(subsetSum.hasSubsetSum(set, n, sum));
        }
    }
}
