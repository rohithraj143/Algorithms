package com.algorithms.arrays.arrangements_rearrangements;

import com.algorithms.arrays.HelperArray;

public class Alternate {

    private static int[] alternate(int[] arr, int size) {
        int pivot = partition(arr, size - 1);
        HelperArray.printArray(arr);
        int[] newArray = new int[size];

        int i = 0, j = pivot, k = 0;
        while (i < size && k < pivot && j < size) {
            newArray[i++] = arr[j];
            newArray[i] = arr[k];
            i++;
            j++;
            k++;
        }

        while (k < pivot) {
            newArray[i++] = arr[k++];
        }

        while (j < size) {
            newArray[i++] = arr[j++];
        }

        return newArray;
    }

    private static int partition(int[] arr, int r) {
        int element = 0;
        int i = -1;

        for (int j = 0; j <= r; j++) {
            if (arr[j] < element) {
                i = i + 1;
                swap(arr, i, j);
            }
        }
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int[] alternate = alternate(arr, arr.length);
        HelperArray.printArray(alternate);

    }
}
