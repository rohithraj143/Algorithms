package com.algorithms.practice1.arrays.arrangements_rearrangements;

import java.util.Arrays;

public class PrintAlternate {

    private static void printAlternate(int[] arr, int size) {

        if (size == 0) {
            return;
        }

        if (size == 1) {
            System.out.print(arr[0]);
        }

        Arrays.sort(arr);
        int minIndex = 0, maxIndex = size - 1;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[maxIndex--] + " ");
            } else {
                System.out.print(arr[minIndex++] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 3, 4, 5, 6};
        printAlternate(arr, arr.length);
    }
}
