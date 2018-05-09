package com.algorithms.practice1.dynamic_programming;

import com.algorithms.practice1.arrays.HelperArray;

public class Largest_Sq_Matr_With1s {

    private int getLargest(int[][] arr, int nr, int nc) {
        if (arr == null) {
            return -1;
        }

        int MAX = -1;
        for (int r = 0; r <= nr; r++) {
            for (int c = 0; c <= nc; c++) {
                if (arr[r][c] != 0 && (r - 1) >= 0 && (c - 1) >= 0) {
                    arr[r][c] = min(arr[r - 1][c], arr[r - 1][c - 1], arr[r][c - 1]) + 1;
                }
                if (arr[r][c] > MAX) {
                    MAX = arr[r][c];
                }
            }
        }
        return MAX;
    }

    private int min(int i, int j, int k) {
        if (i <= j && i <= k) {
            return i;
        } else if (j <= i && j <= k) {
            return j;
        } else {
            return k;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        Largest_Sq_Matr_With1s largest_sq_matr_with1s = new Largest_Sq_Matr_With1s();
        int rowSize = arr.length;
        int columnSize = arr[0].length;
        int largest = largest_sq_matr_with1s.getLargest(arr, rowSize - 1, columnSize - 1);
        System.out.println(largest);
        HelperArray.print2DArray(arr);
    }
}
