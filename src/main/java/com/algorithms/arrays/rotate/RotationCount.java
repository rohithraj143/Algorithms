package com.algorithms.arrays.rotate;

public class RotationCount {

    private static int rotationCount(int[] arr, int size) {
        int pivot = -1;
        for(int i = 1;i<size;i++) {
            if(arr[i] < arr[i-1]) {
                pivot = i;
                break;
            }
        }

        return pivot;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 1, 2};
        System.out.println(rotationCount(arr, arr.length));
    }
}
