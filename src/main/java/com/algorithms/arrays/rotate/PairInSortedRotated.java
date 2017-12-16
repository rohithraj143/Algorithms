package com.algorithms.arrays.rotate;

public class PairInSortedRotated {

    private static boolean isPairInSortedRotated(int[] arr, int size, int key) {

        if (arr != null) {
            int pivot = findPivot(arr, 0, size - 1);

            return pivot != -1 && (
                    findPair(arr, 0, pivot, key) ||
                            findPair(arr, pivot + 1, size - 1, key) ||
                            findPair(arr, pivot + 1, pivot, key));

        }
        return false;
    }

    private static int findPivot(int[] arr, int low, int high) {

        if (low > high) {
            return -1;
        }

        if (low == high) {
            return low;
        }

        int mid = (low + high) / 2;

        if (high > mid && arr[mid] > arr[mid + 1]) {
            return mid;
        } else if (low < mid && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }

        if (arr[low] <= arr[mid]) {
            return findPivot(arr, mid + 1, high);
        }

        return findPivot(arr, low, mid - 1);
    }

    private static boolean findPair(int[] arr, int low, int high, int key) {

        while (low <= high) {
            if (arr[low] + arr[high] == key) {
                return true;
            } else if (arr[low] + arr[high] < key) {
                low++;
            } else {
                high--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 1, 2};
        System.out.println(isPairInSortedRotated(arr, arr.length, 60));
    }
}
