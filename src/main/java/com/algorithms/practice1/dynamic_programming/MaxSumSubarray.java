/**
 * @author Rohith Raj 2/26/2018
 */
package com.algorithms.practice1.dynamic_programming;

public class MaxSumSubarray {

    public static int maxSumSubarray(int[] arr, int n) {
        if (arr == null) {
            return -1;
        }

        int[] temp = new int[n];
        int maxLen = -1;

        for (int i = 0; i < n; i++) {
            int max = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    int len = arr[i] + temp[j];
                    if (len > max) {
                        max = len;
                    }
                }
            }
            temp[i] = max;
            if (max > maxLen) {
                maxLen = max;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {20, 3, 1, 15, 16, 2, 12, 13};
        int maxSum = maxSumSubarray(arr, arr.length);
        System.out.println(maxSum);
    }
}
