package com.algorithms.practice1.divide_and_conquer;

public class CountInversions {

    private int count = 0;

    private void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[i + left];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = arr[i + mid + 1];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] > R[j]) {
                count += n1-i;
                arr[k++] = R[j++];
            } else {
                arr[k++] = L[i++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    private void mergeSortForCount(int[] arr, int left, int right) {
        if (right > left) {
            int mid = (left + right) / 2;
            mergeSortForCount(arr, left, mid);
            mergeSortForCount(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 1, 3, 4, 6};
        CountInversions countInversions = new CountInversions();
        countInversions.mergeSortForCount(arr, 0, arr.length - 1);
        System.out.println("Count is " + countInversions.count);
    }
}
