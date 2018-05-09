package com.algorithms.practice1.divide_and_conquer;

public class BinarySearch2D {

    private boolean search(int[][] arr, int ru, int rd, int cl, int cr, int key) {

        if (rd > ru && cr > cl) {
            int m1 = (ru + rd) / 2;
            int m2 = (cl + cr) / 2;

            if (arr[m1][m2] == key) {
                return true;
            }
            if (key < arr[m1][m2]) {
                return search(arr, ru, m1, cl, m2, key)
                        || search(arr, ru, m1, m2 + 1, cr, key)
                        || search(arr, m1 + 1, rd, cl, m2 - 1, key);
            }
            return search(arr, m1, rd, m2, cr, key)
                    || search(arr, ru, m1 - 1, m2 + 1, cr, key)
                    || search(arr, m1 + 1, rd, cl, m2 - 1, key);
        }
        return false;
    }
}
