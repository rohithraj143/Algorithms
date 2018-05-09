package com.algorithms.practice1.divide_and_conquer;

public class Count1s {

    private int noOfOnes2(int[] arr, int l, int r, int n) {
        if (l <= r) {
            int m = (l + r) / 2;

            if ((l == m || arr[m - 1] == 0) && arr[m] == 1) {
                return n - m;
            }
            if (arr[m] == 1) {
                return noOfOnes2(arr, l, m - 1, n);
            }
            return noOfOnes2(arr, m + 1, r, n);
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Count1s count1s = new Count1s();
        System.out.println(count1s.noOfOnes2(arr, 0, arr.length - 1, arr.length));
    }
}
