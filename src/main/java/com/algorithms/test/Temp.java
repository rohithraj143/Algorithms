/**
 * @author Rohith Raj 3/26/2018
 */
package com.algorithms.test;

public class Temp {

    private int data = 10;

    private static Temp temp = null;

    private Temp() {}

    public static Temp getObj() {
        if (temp == null) {
            synchronized (Temp.class) {

                temp = new Temp();
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Temp temp = Temp.getObj();
                temp.data = 20;
                System.out.println("in thread1 " + temp.data);
                try {
                    Thread.sleep(1000);
                    System.out.println("in thread1 after sleep " + temp.data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Temp temp = Temp.getObj();
                temp.data = 30;
                System.out.println("in thread2 " + temp.data);
            }
        });

        thread1.start();
        thread2.start();


    }
}