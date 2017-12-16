package com.algorithms.arrays.rotate;

import com.algorithms.arrays.HelperArray;

public class CyclicRotation {

    private static void rotate(int[] arr, int startIndex, int endIndex) {
        int temp;
        while(startIndex <= endIndex) {
            temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
    private static void cyclicRotate(int[] arr, int d) {
        if(arr != null) {
            int endLength = arr.length-1;
            rotate(arr,0, endLength);
            rotate(arr, 0, d-1);
            rotate(arr, d, endLength);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        cyclicRotate(arr, 2);
        HelperArray.printArray(arr);
    }
}
