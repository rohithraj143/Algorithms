package com.algorithms.practice1;

import java.util.Arrays;
import java.util.Scanner;

public class GeeksForGeeksHelp3 {

    private static int maxSumPair(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (arr[i - 1] - arr[i - 2] < k) {
                dp[i] = dp[i - 2] + arr[i - 1] + arr[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();

        while (var-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(maxSumPair(arr, n, k));
        }
        sc.close();
    }
}
