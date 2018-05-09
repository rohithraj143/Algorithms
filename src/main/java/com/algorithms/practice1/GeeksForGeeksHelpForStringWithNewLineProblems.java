package com.algorithms.practice1;

import java.util.Scanner;

public class GeeksForGeeksHelpForStringWithNewLineProblems {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        sc.nextLine();

        while (var-- > 0) {
            String s = sc.nextLine();
            //s = somefunction(s, s.length());
            System.out.println(s);
        }
        sc.close();
    }
}