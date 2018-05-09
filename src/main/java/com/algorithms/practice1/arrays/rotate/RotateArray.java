package com.algorithms.practice1.arrays.rotate;

import com.algorithms.practice1.arrays.HelperArray;
import com.algorithms.practice1.general.GCD;

public class RotateArray {

    private void leftRotate(int[] arr, int d) {
        if(arr != null) {

            for(int i = 0; i < d; i++) {
                int temp = arr[0];
                int j = 0;
                for(; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                arr[j] = temp;
            }
        }

    }

    private void leftRotateUsingJugglingAlgo(int[] arr, int d) {
        if(arr != null) {
            int size = arr.length;
            int setSize = (int) new GCD().gcd(size, d);

            for(int i = 0; i < setSize ;i++) {

                int j = i;
                int k = (j+d) % size;
                int temp = arr[i];
                while(k != i) {
                    arr[j] = arr[k];
                    j = k;
                    k = (j+d) % size;
                }
                arr[j] = temp;
            }

        }
    }

    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2);
        HelperArray.printArray(arr);
        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        rotate.leftRotateUsingJugglingAlgo(arr, 6);
        HelperArray.printArray(arr);
        rotate.leftRotateUsingJugglingAlgo(arr, 6);
        HelperArray.printArray(arr);
    }
}
