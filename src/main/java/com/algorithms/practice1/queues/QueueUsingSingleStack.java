package com.algorithms.practice1.queues;

import com.algorithms.practice1.stacks.Stack;

public class QueueUsingSingleStack {

    private Stack stack = new Stack();

    private void enqueue(int item) {
        stack.push(item);
    }

    private void reverse(int[] arr, int end) {
        int start = 0;
        while (end >= start) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    private int dequeue() {
        if (!stack.isEmpty()) {
            reverse(stack.getArr(), stack.getTop());
            int item = stack.pop();
            reverse(stack.getArr(), stack.getTop());
            return item;
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        QueueUsingSingleStack queue = new QueueUsingSingleStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
