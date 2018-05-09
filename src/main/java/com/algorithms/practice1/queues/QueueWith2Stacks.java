package com.algorithms.practice1.queues;

import com.algorithms.practice1.stacks.Stack;

public class QueueWith2Stacks {

    private Stack stack1 = new Stack();
    private Stack stack2 = new Stack();

    private void enqueue(int item) {
        stack1.push(item);
    }

    private int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueWith2Stacks queue = new QueueWith2Stacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }

}
