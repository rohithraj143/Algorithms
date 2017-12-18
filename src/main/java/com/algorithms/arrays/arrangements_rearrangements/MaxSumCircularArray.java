package com.algorithms.arrays.arrangements_rearrangements;

import com.algorithms.arrays.HelperArray;

import java.util.Arrays;

public class MaxSumCircularArray {

    public static long maxSum(long[] arr, int size) {

        if (size == 0) {
            return 0;
        }

        if (size == 1) {
            return arr[0];
        }

        Arrays.sort(arr);

        HelperArray.printArray(arr);
        long maxLength = arr[size - 1] + 1, sum = 0;
        int minIndex = 0, maxIndex = size - 1;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[minIndex++] % maxLength) * maxLength;
            } else {
                arr[i] += (arr[maxIndex--] % maxLength) * maxLength;
            }
        }

        for (int i = 0; i < size; i++) {
            arr[i] = arr[i] / maxLength;
        }

        HelperArray.printArray(arr);

        int count = 1;
        for (int i = 1; count <= size; i++, count++) {
            long a = arr[i % size];
            long b = arr[i - 1];
            sum += a - b > 0 ? a - b : b - a;
        }
        return sum;
    }

    public static void main(String[] args) {
        long arr[] = {4, 2, 1, 8};
        System.out.println(maxSum(arr, arr.length));
    }
}
