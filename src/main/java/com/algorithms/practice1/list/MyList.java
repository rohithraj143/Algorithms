package com.algorithms.practice1.list;

public class MyList {

    public static Node generateSingleLinkedList() {
        Node n5 = new Node(50, null);
        Node n4 = new Node(40, n5);
        Node n3 = new Node(30, n4);
        Node n2 = new Node(20, n3);
        return new Node(10, n2);
    }

    public static void main(String[] args) {

        Node head = generateSingleLinkedList();

        System.out.println(head);
        printList(head);
    }

    public static void printList(Node node) {
        if (node == null) {
            return;
        }

        while (node != null) {
            System.out.print(node.getData()+ " ");
            node = node.getNext();
        }
        System.out.println();
    }


}
