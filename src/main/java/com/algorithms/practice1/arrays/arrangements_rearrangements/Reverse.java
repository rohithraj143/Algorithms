package com.algorithms.practice1.arrays.arrangements_rearrangements;

import com.algorithms.practice1.arrays.HelperArray;

public class Reverse {

    private static void reverse(int[] arr) {

        if (arr != null)
            for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
    }

    private static void stringReverse(char[] c) {

        if (c != null) {

            for (int i = 0, j = c.length - 1; i <= j; i++, j--) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{23, 34, 121, 4, 5, 6, 5};
        reverse(arr);
        HelperArray.printArray(arr);
        char[] c = "rohith".toCharArray();
        stringReverse(c);
        HelperArray.printArray(c);
    }
}
