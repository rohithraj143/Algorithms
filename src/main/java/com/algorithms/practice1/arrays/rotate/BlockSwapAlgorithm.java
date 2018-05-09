package com.algorithms.practice1.arrays.rotate;

import com.algorithms.practice1.arrays.HelperArray;

public class BlockSwapAlgorithm {

    private static void leftRotate(int[] arr, int index, int d, int n) {

        if (d == 0 || d == n) {
            return;
        }

        if (d == n - d) {
            swap(arr, index, index + d, n - d);
            return;
        }

        if (d < n - d) {
            swap(arr, index, index + n - d, d);
            leftRotate(arr, index, d, n - d);
        } else {
            swap(arr, index, index + d, n - d);
            leftRotate(arr, index + n - d, 2 * d - n, d);
        }
    }

    private static void swap(int[] arr, int fi, int si, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[fi];
            arr[fi++] = arr[si];
            arr[si++] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 14, 16, 18, 20};
        leftRotate(arr, 0, 7, arr.length);
        HelperArray.printArray(arr);
    }
}
