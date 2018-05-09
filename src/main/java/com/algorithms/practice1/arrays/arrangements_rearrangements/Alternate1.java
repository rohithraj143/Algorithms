package com.algorithms.practice1.arrays.arrangements_rearrangements;

import com.algorithms.practice1.arrays.HelperArray;

public class Alternate1 {

    private static int mergeSortAlternate(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSortAlternate(arr, l, mid);
            mergeSortAlternate(arr, mid + 1, r);
            return merge(arr, l, mid, r);
        }
        return -1;
    }

    private static int merge(int[] arr, int l, int m, int r) {

        int leftArraySize = (m - l + 1);
        int rightArraySize = (r - m);

        int[] L = new int[leftArraySize];
        int[] R = new int[rightArraySize];

        System.arraycopy(arr, l, L, 0, leftArraySize);
        System.arraycopy(arr, m + 1, R, 0, rightArraySize);

        int i = 0, j = 0;
        while (i < leftArraySize && j < rightArraySize
                && (L[i] < 0 || R[j] < 0)) {
            if (L[i] < 0) {
                arr[l++] = L[i++];
            } else {
                arr[l++] = R[j++];
            }
        }

        int pivot = -1;

        while (i < leftArraySize) {
            if (pivot == -1) {
                pivot = l;
            }
            arr[l++] = L[i++];
        }

        while (r < rightArraySize) {
            if (pivot == -1) {
                pivot = l;
            }
            arr[l++] = R[j++];
        }

        return pivot;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int size = arr.length;
        int pivot = mergeSortAlternate(arr, 0, size - 1);

        if (pivot != -1){
            int[] arr1 = new int[size];
            boolean flag = true;
            int i = 0, j = 0, k = pivot;
            while (k < size && j < pivot) {
                if (flag) {
                    arr1[i++] = arr[k++];
                    flag = false;
                } else {
                    arr1[i++] = arr[j++];
                    flag = true;
                }
            }

            while (k < size) {
                arr1[i++] = arr[k++];
            }

            while (j < pivot) {
                arr1[i++] = arr[j++];
            }

            HelperArray.printArray(arr1);
        } else {
            System.out.println("Invalid pivot");
        }
    }
}
