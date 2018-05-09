/**
 * @author Rohith Raj 3/26/2018
 */
package com.algorithms.test;

public class Thread1 implements Runnable {

    private Test t;

    Thread1(Test t) {
        this.t = t;
    }
    @Override
    public void run() {
        System.out.println("from thread1");
        t.getDetails();
        try {
            Thread.sleep(1000);
            System.out.println("After sleep");
            t.getDetails();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
