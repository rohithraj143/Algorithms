package com.algorithms.practice1.divide_and_conquer;

import com.algorithms.practice1.arrays.HelperArray;

public class NutsAndBolts {

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int[] arr, int left, int right, int pivot) {
        int i = left - 1;
        int j = left;
        while (j < right) {
            if (arr[j] < pivot) {
                swap(arr, ++i, j);
            } else if (arr[j] == pivot) {
                swap(arr, j, right);
                j--;
            }
            j++;
        }
        i++;
        swap(arr, i, right);
        return i;
    }

    private void matchNutsAndBolts(int[] nuts, int left, int right, int[] bolts) {

        if (right > left) {
            int pivot = partition(nuts, left, right, bolts[right]);
            partition(bolts, left, right, nuts[pivot]);
            matchNutsAndBolts(nuts, left, pivot - 1, bolts);
            matchNutsAndBolts(nuts, pivot + 1, right, bolts);
        }
    }

    public static void main(String[] args) {
        int[] nuts = {2, 4, 5, 8, 6, 1, 7, 3, 9};
        int[] bolts = {9, 3, 4, 6, 7, 2, 1, 5, 8};

        HelperArray.printArray(nuts);
        HelperArray.printArray(bolts);
        NutsAndBolts nutsAndBolts = new NutsAndBolts();
        nutsAndBolts.matchNutsAndBolts(nuts, 0, nuts.length-1, bolts);

        HelperArray.printArray(nuts);
        HelperArray.printArray(bolts);
    }
}
