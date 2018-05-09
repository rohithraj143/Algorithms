package com.algorithms.practice1.dynamic_programming;

public class Knapsack {

    private int maxProfit(int[] w, int[] p, int c, int n) {
        int[][] T = new int[n + 1][c + 1];
        for (int i = 1; i <= n; i++) {
            T[i][0] = 0;
            for (int j = 1; j <= c; j++) {
                if (w[i - 1] > j) {
                    T[i][j] = T[i - 1][j];
                } else {
                    T[i][j] = Math.max(p[i - 1] + T[i - 1][j - w[i - 1]], T[i - 1][j]);
                }
            }
        }
        return T[n][c];
    }

    public static void main(String[] args) {
        int[] w = {1, 2, 4};
        int[] p = {10, 12, 28};
        int c = 6;
        int n = w.length;
        Knapsack knapsack = new Knapsack();
        System.out.println(knapsack.maxProfit(w, p, c, n));
    }
}
