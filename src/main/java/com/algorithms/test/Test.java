/**
 * @author Rohith Raj 3/26/2018
 */
package com.algorithms.test;

public class Test {

    private int a = 10;
    private int b = 20;
    private int c = 30;
    private int d = 40;


    public void getDetails() {

        synchronized(Thread1.class) {
            System.out.println(a);
        }

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
