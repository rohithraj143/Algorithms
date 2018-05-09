/**
 * @author Rohith Raj 2/26/2018
 */
package com.algorithms.practice1.dynamic_programming;

public class LongestIncreasingSubsequence {


    public static int lcs(int[] arr, int n) {

        if (arr == null) {
            return -1;
        }

        int[] temp = new int[n];
        int maxLen = -1;

        for (int i = 0; i < n; i++) {
            int max = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    int len = 1 + temp[j];
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
        int[] arr = {2, 10, 13, 5, 3, 11, 12};
        int lcs = lcs(arr, arr.length);
        System.out.println(lcs);
    }
}
