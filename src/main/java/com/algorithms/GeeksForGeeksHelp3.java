package com.algorithms;

import com.algorithms.arrays.HelperArray;
import com.algorithms.arrays.arrangements_rearrangements.MaxSumCircularArray;
import com.algorithms.arrays.arrangements_rearrangements.SegregateEvenOdd;

import java.util.Scanner;

public class GeeksForGeeksHelp3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        HelperArray.printArray(arr);
        SegregateEvenOdd.segregate(arr, arr.length);
        HelperArray.printArray(arr);
        sc.close();
    }
}
