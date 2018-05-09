package com.algorithms.practice1.divide_and_conquer;

public class MissingNumber {

    private int missingNumber(int[] arr, int a, int d, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            if (arr[m + 1] - arr[m] != d) {
                return arr[m] + d;
            } else if (m > 0 && arr[m] - arr[m - 1] != d) {
                return arr[m - 1] + d;
            } else if (arr[m] != a + m * d) {
                return missingNumber(arr, a, d, l, m - 1);
            } else {
                return missingNumber(arr, a, d, m + 1, r);
            }
        }
        return -1;
    }

    private int missingNumber2(int[] arr, int a, int d, int l, int r) {
        if (l <= r) {
            int m = (l + r) / 2;

            int T = a + m * d;
            if (T == arr[m]) {
                return missingNumber2(arr, a, d, m + 1, r);
            }
            return missingNumber2(arr, a, d, l, m - 1);
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 0, 2, 4, 6, 10, 12, 14, 16, 18, 20};
        int n = arr.length + 1;
        int a = arr[0];
        int d = (arr[n - 2] - a) / (n - 1);

        MissingNumber m = new MissingNumber();
        System.out.println(m.missingNumber(arr, a, d, 0, n - 2));
        System.out.println(a + m.missingNumber2(arr, a, d, 0, n - 2) * d);
    }
}
