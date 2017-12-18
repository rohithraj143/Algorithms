package com.algorithms.arrays.arrangements_rearrangements;

import com.algorithms.arrays.HelperArray;

import java.util.Arrays;

public class SegregateEvenOdd {

    public static void segregate(int[] arr, int size) {
        if (size == 0 || size == 1) {
            return;
        }

        int left = 0, right = size - 1;

        while (left <= right) {
            while (arr[left] % 2 == 0 && left <= right) {
                left++;
            }

            while (arr[right] % 2 == 1 && left <= right) {
                right--;
            }
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0 && left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }

        HelperArray.printArray(arr, 0, left);
        Arrays.sort(arr, 0, left);
        HelperArray.printArray(arr, 0, left);
        HelperArray.printArray(arr, left, size);
        Arrays.sort(arr, left, size);
        HelperArray.printArray(arr, left, size);
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        segregate(arr, arr.length);
        HelperArray.printArray(arr);
    }

}
