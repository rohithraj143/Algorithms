package com.algorithms.practice1.trees;

public class Queue {

    private Node[] arr = new Node[10];
    private int start = 0, rear = 0, n = arr.length;

    public boolean add(Node node) {

        rear = (rear + 1) % n;

        if (rear == start) {
            return false;
        }

        arr[rear] = node;
        return true;
    }

    public Node poll() {

        if (start == rear) {
            return null;
        }

        start = (start + 1) % n;
        return arr[start];
    }

    public boolean isEmpty() {
        return (start == rear);
    }

}
