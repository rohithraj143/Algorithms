/**
 * @author Rohith Raj 3/26/2018
 */
package com.algorithms.test;

public class Driver {

    public static void main(String[] args) {
        Test t = new Test();
        Thread thread1 = new Thread(new Thread1(t));
        Thread thread2 = new Thread(new Thread2(t));

        thread1.start();
        thread2.start();


    }
}
