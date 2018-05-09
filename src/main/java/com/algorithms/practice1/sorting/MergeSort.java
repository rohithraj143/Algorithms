package com.algorithms.practice1.sorting;

import com.algorithms.practice1.arrays.HelperArray;

public class MergeSort {

    private static void merge(int[] arr, int l, int m, int r) {
        int leftArraySize = (m-l+1);
        int rightArraySize = (r-m);

        int[] L = new int[leftArraySize];
        int[] R = new int[rightArraySize];

        for(int i = 0; i < leftArraySize; i++) {
            L[i] = arr[l+i];
        }

        for(int i = 0; i < rightArraySize; i++) {
            R[i] = arr[m+1+i];
        }

        int i=0,j=0;
        while(i < leftArraySize && j < rightArraySize) {
            if(L[i] <= R[j]) {
                arr[l++] = L[i++];
            } else {
                arr[l++] = R[j++];
            }
        }

        while(i < leftArraySize) {
            arr[l++] = L[i++];
        }

        while(j < rightArraySize) {
            arr[l++] = R[j++];
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if(l < r) {

            int mid = (l + r) /2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {

        int[] arr = {-2, 3, 5, 0, -3, 7, -1};
        mergeSort(arr, 0, arr.length-1);
        HelperArray.printArray(arr);
    }
}
