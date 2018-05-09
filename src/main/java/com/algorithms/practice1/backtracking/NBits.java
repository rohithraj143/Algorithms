/**
 * @author Rohith Raj 3/18/2018
 */
package com.algorithms.practice1.backtracking;

public class NBits {

    static void generate(int[] arr, int start, int end) {
        if (start == end) {
            for (int i = 0; i < end; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        } else {
            arr[start] = 0;
            generate(arr, start + 1, end);
            arr[start] = 1;
            generate(arr, start + 1, end);
            arr[start] = 2;
            generate(arr, start + 1, end);
        }
    }

    public static void main(String[] args) {
        generate(new int[3], 0, 3);
    }
}
