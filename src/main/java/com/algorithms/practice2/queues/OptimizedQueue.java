/**
 * @author Rohith Raj 2/22/2018
 */
package com.algorithms.practice2.queues;

public class OptimizedQueue {

    int f = 0, r = 0, n = 4;
    int[] arr = new int[n];

    public void enqueue(int data) throws Exception {
        r = (r + 1) % n;
        if (f == r) {
            throw new Exception("Queue is full");
        }
        arr[r] = data;
    }

    public int dequeue() throws Exception {
        if (f == r) {
            throw new Exception("Queue is empty");
        }
        f = (f + 1) % n;
        return arr[f];
    }

    public static void main(String[] args) throws Exception {
        OptimizedQueue queue = new OptimizedQueue();
        queue.enqueue(10);
        queue.enqueue(2);
        queue.enqueue(11);
        //queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
