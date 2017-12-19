package com.algorithms.graphs;

public class Queue {

    private Node head;

    public void push(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
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
