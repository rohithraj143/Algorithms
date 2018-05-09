package com.algorithms.practice1.arrays;

public class HelperArray {

    public static void printArray(int[] arr) {
        System.out.println();
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void printArray(long[] arr) {
        System.out.println();
        for (long a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void printArray(char[] ch) {
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] arr, int startIndex, int endIndex) {
        System.out.println();
        for (int i = startIndex; i < endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArray(long[] arr, int startIndex, int endIndex) {
        System.out.println();
        for (int i = startIndex; i < endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void print2DArray(int[][] arr) {
        int columnLength = arr[0].length;

        for (int[] anArr : arr) {
            for (int j = 0; j < columnLength; j++) {
                System.out.print(anArr[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
