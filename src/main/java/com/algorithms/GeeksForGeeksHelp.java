package com.algorithms;

import java.util.Scanner;

public class GeeksForGeeksHelp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();

        while (var-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++)
                arr[i] = sc.nextInt();

            //program logic

            for (int i = 0; i < size; i++)
                System.out.print(arr[i] + " ");

            System.out.println();
        }
        sc.close();
    }
}