package com.algorithms.practice1.arrays.arrangements_rearrangements;

import com.algorithms.practice1.arrays.HelperArray;

public class Segregate {

    private static void segregate(int[] arr, int size) {
        if (size == 0 || size == 1) {
            return;
        }

        int left = 0, right = size - 1;

        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }

            while (arr[right] == 1 && left < right) {
                right--;
            }
            if (arr[left] == 1 && arr[right] == 0) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 1, 1};
        segregate(arr, arr.length);
        HelperArray.printArray(arr);
    }
}
