package com.algorithms.sorting;

import com.algorithms.arrays.HelperArray;

public class QuickSort {

    private static void quickSort(int[] arr, int p, int r) {
        if (p < r) {
            int pivot = partition(arr, p, r);
            quickSort(arr, p, pivot - 1);
            quickSort(arr, pivot + 1, r);
        }
    }

    private static int partition(int[] arr, int p, int r) {
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (arr[j] < x) {
                i = i + 1;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 5, 2, 1, 0, 4, 3, 3};
        quickSort(arr, 0 , arr.length-1);
        HelperArray.printArray(arr);
    }
}
