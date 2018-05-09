package com.algorithms.practice1.arrays.rotate;

public class MaximumSumUsingRotations {

    private static int maxSum(int[] arr, int size) {
        if (arr != null) {

            int arraySum = 0;
            int generalSum = 0;

            for (int i = 0; i < size; i++) {
                arraySum += arr[i];
                generalSum += i * arr[i];
            }

            int maxSum = generalSum;

            for (int i = 1; i < size; i++) {
                int newSum = generalSum + arraySum - size * (arr[size - i]);
                if (newSum > maxSum) {
                    maxSum = newSum;
                }
                generalSum = newSum;
            }
            return maxSum;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 20, 2, 10};
        System.out.println(maxSum(arr, 4));
    }
}
