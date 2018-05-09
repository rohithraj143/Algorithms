/**
 * @author Rohith Raj 3/15/2018
 */
package com.algorithms.practice1.dynamic_programming;

public class SumOfDigitsUptoN {
    private static void computeSumArray(int[] arr, int d) {
        arr[0] = 0;
        arr[1] = 45;
        for (int i = 2; i <= d; i++) {
            arr[i] = arr[i - 1] * 10 + (int) Math.pow(10, i - 1) * 45;
        }
    }

    private static int sumOfDigitsUtil(int N, int[] arr) {
        if (N != 0) {
            int d = (int) Math.floor(Math.log10(N));
            int lmd = N / (int) Math.pow(10, d);
            return lmd * arr[d]
                    + (lmd * (lmd - 1) / 2) * (int) Math.pow(10, d)
                    + lmd * (1 + N % (int) Math.pow(10, d))
                    + sumOfDigitsUtil(N % (int) Math.pow(10, d), arr);
        }
        return 0;
    }

    private static int sumOfDigits(int N) {
        int d = (int) Math.floor(Math.log10(N));
        int[] arr = new int[d + 1];
        computeSumArray(arr, d);
        return sumOfDigitsUtil(N, arr);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(12));
    }
}
