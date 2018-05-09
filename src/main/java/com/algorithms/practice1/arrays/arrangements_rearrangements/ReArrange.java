package com.algorithms.practice1.arrays.arrangements_rearrangements;

import com.algorithms.practice1.arrays.HelperArray;

public class ReArrange {

    private static void rearrange(int[] arr, int size) {

        if (size == 0 || size == 1) {
            return;
        }

        int maxLength = arr[size-1] + 1, minIndex = 0, maxIndex = size-1;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxIndex--] % maxLength) * maxLength;
            } else {
                arr[i] += (arr[minIndex++] % maxLength) * maxLength;
            }
        }

        for (int i = 0; i < size; i++) {
            arr[i] = arr[i] / maxLength;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int size = arr.length;
        rearrange(arr, size);

        HelperArray.printArray(arr);
    }
}
