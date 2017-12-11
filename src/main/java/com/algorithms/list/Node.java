package com.algorithms.list;

public class Node {

    public int data;
    public Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    private String getData(Node node) {

        if(node == null) {
            return null;
        }

        StringBuilder str = new StringBuilder(Integer.toString(node.data));
        node = node.next;

        while(node != null) {
            str.append(",").append(Integer.toString(node.data));
            node = node.next;
        }

        return str.toString();
    }

    @Override
    public String toString() {

        return "[" + getData(this) + "]";
    }
}
