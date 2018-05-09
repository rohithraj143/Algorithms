package com.algorithms.practice1.dynamic_programming;

public class Fibonacci1 {

    private final int MAX = 100;
    private final int NIL = -1;
    private int[] lookup = new int[MAX];

    void _initialize() {
        for (int i = 0; i < MAX; i++)
            lookup[i] = NIL;
    }

    private int fibonacci(int n) {
        if (lookup[n] == NIL) {
            if (n <= 1) {
                lookup[n] = n;
            } else {
                lookup[n] = fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
        return lookup[n];
    }

    public static void main(String[] args) {
        Fibonacci1 fibonacci1 = new Fibonacci1();
        fibonacci1._initialize();
        System.out.println(fibonacci1.fibonacci(10));
    }
}
