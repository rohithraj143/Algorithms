package com.algorithms.practice1.general;

public class GCD {

    public long gcd(long a, long b) {
        if (a == 0 || b == 0 || a < b) {
            return -1;
        }
        while (true) {
            long rem = a % b;
            if (rem == 0) {
                return b;
            }
            a = b;
            b = rem;
        }
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.gcd(12, 3));
        System.out.println(gcd.gcd(199, 43));
        System.out.println(gcd.gcd(122424, 343));

    }
}
