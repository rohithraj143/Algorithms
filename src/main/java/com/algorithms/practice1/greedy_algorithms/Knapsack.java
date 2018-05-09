package com.algorithms.practice1.greedy_algorithms;

public class Knapsack {

    private void mergeSort(int[] arr, int[] target, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, target, start, mid);
            mergeSort(arr, target, mid + 1, end);
            merge(arr, target, start, mid, end);
        }
    }

    private void merge(int[] arr, int[] target, int start, int mid, int end) {
        int n1 = end - start + 1;
        int n2 = end - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[start + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = start, l = mid + 1;
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                target[start++] = k;
                i++;
                k++;
            } else {
                target[start++] = l;
                j++;
                l++;
            }
        }

        while (i < n1) {
            target[start++] = k;
            i++;
            k++;
        }
        while (j < n2) {
            target[start++] = l;
            j++;
            l++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] target = new int[arr.length];
        Knapsack k = new Knapsack();
        k.mergeSort(arr, target, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(target[i]);
        }
    }
}
