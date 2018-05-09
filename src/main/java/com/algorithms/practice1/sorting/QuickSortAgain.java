package com.algorithms.practice1.sorting;

import com.algorithms.practice1.arrays.HelperArray;

public class QuickSortAgain {

    private static void quickSort(int[] arr, int p, int r) {
        if(p < r) {
            int pivot = partition(arr, p, r);
            quickSort(arr, p, pivot-1);
            quickSort(arr, pivot+1, r);
        }
    }

    private static int partition(int[] arr, int p, int r) {
        int element = arr[r];

        int i = p-1;
        int j = p;

        while(j < r) {
            if(arr[j] < element) {
                i = i+1;
                swap(arr, i , j);
            }
            j++;
        }
        i =i+1;
        swap(arr, i, j);
        return i;
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
