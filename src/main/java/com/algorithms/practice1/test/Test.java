package com.algorithms.practice1.test;

public class Test {

    class Index {
        int start;
        int end;
    }

    public void f(int[] arr, int n, Index index) {
        arr[2] = 5;
        n = 10;
        index.start = 10;
        index.end = 20;
    }

    public static void main(String[] args) {

        Test t = new Test();
        int[] arr = {1, 2, 3};
        int n = 5;
        Index index = t.new Index();

        t.f(arr, n, index);
        System.out.println(arr[2] + " " + n + " " + index.start + " " + index.end);

    }
}
