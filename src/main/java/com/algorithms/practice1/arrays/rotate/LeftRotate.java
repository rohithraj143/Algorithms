package com.algorithms.practice1.arrays.rotate;

public class LeftRotate {

    private static void leftRotate(int[] arr, int size, int d) {

        if (arr != null) {
            int[] arr1 = new int[2 * size];

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = arr[i % size];
            }

            for (int i = d; i < d + size; i++) {
                System.out.println(arr1[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;
        leftRotate(arr, n, 4);
    }
}
