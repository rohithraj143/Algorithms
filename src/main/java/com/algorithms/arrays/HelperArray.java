package com.algorithms.arrays;

public class HelperArray {

    public static void printArray(int[] arr) {
        System.out.println();
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void printArray(long[] arr) {
        System.out.println();
        for(long a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void printArray(char[] ch) {
        for(char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] arr, int startIndex, int endIndex) {
        System.out.println();
        for(int i = startIndex; i < endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArray(long[] arr, int startIndex, int endIndex) {
        System.out.println();
        for(int i = startIndex; i < endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
