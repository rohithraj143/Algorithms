package com.algorithms.practice1.divide_and_conquer;

public class MedianOf2SortedArrays {

    private int median(int[] arr, int[] brr, int l1, int r1, int l2, int r2) {

        int m1 = (l1 + r1) / 2;
        int m2 = (l2 + r2) / 2;

        if (r1 - l1 == 1 && r2 - l2 == 1) {
            m1 = (arr[l1] < brr[l2] ? brr[l2] : arr[l1]);
            l1++;
            l2++;
            m2 = (arr[l1] < brr[l2] ? arr[l1] : brr[l2]);
            return (m1 + m2) / 2;
        }

        if (arr[m1] < brr[m2]) {
            return median(arr, brr, m1, r1, l2, m2);
        }
        return median(arr, brr, l1, m1, m2, r2);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 21, 34, 61, 73, 79, 81};
        int[] brr={4, 8, 13, 14, 25, 54, 59, 67, 75};

        MedianOf2SortedArrays med = new MedianOf2SortedArrays();
        System.out.println(med.median(arr, brr, 0, arr.length-1, 0, brr.length-1));
    }
}
