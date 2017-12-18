package com.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeeksForGeeksHelp1 {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int var = Integer.valueOf(br.readLine());

            while (var-- > 0) {
                int size = Integer.valueOf(br.readLine());
                int[] arr = new int[size];

                String[] array = br.readLine().split("\\s");

                for (int i = 0; i < size; i++) {
                    arr[i] = Integer.valueOf(array[i]);
                }

                //program logic

                for (int i = 0; i < size; i++)
                    System.out.print(arr[i] + " ");

                System.out.println();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
