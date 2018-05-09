package com.algorithms.practice1.queues;

public class Queue {

    private int r = 0, f = 0, MAX = 5;
    private int[] arr = new int[MAX];

    private void enqueue(int item) {
        r = (r + 1) % MAX;
        if (r == f) {
            System.out.println("error");
            if (r == 0) {
                r = MAX - 1;
            } else {
                r = r - 1;
            }
            return;
        }
        arr[r] = item;
    }

    private int dequeue() {
        if (f == r) {
            System.out.println("error");
            return -1;
        }
        f = (f + 1) % MAX;
        return arr[f];
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
