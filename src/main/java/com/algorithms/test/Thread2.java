/**
 * @author Rohith Raj 3/26/2018
 */
package com.algorithms.test;

public class Thread2 implements Runnable {

    private Test t;

    Thread2(Test t) {
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("from thread2");
        t.getDetails();

        t.setC(100);
    }
}
