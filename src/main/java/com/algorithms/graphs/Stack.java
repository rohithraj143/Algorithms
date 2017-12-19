package com.algorithms.graphs;

public class Stack {

    private Node head;

    public void push(int data) {
        Node node = new Node(data, null);

        if (head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public Node pop() {
        if (head == null) {
            return null;
        }

        Node temp = head;
        head = head.next;
        return temp;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
