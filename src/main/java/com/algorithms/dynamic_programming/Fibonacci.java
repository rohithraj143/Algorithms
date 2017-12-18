package com.algorithms.dynamic_programming;

import com.algorithms.arrays.HelperArray;

public class Fibonacci {

    private static long[] lookup;

    private static long fibonacci(int n) {
        if (lookup[n] == -1) {
            if (n <= 1) {
                lookup[n] = n;
            } else {
                lookup[n] = fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
        return lookup[n];
    }

    public static void main(String[] args) {
        int size = 100;
        lookup = new long[size + 1];

        for (int i = 0; i < size + 1; i++) {
            lookup[i] = -1;
        }


        System.out.println(fibonacci(size));
        HelperArray.printArray(lookup, 1, size + 1);
    }
}
