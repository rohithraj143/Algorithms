package com.algorithms.practice1.list;

public class ReverseList {

    Node head;

    private Node reverse(Node head) {

        if (head == null) {
            return null;
        }

        Node prev = null;
        while (head != null) {
            Node temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    private void reverseUsingRecursion(Node prev, Node curr) {
        if (curr == null) {
            return;
        }
        if(curr.next == null) {
            head = curr;
        }
        reverseUsingRecursion(curr, curr.next);
        curr.next = prev;
    }

    public static void main(String[] args) {
        Node head = MyList.generateSingleLinkedList();
        MyList.printList(head);
        ReverseList reverseList = new ReverseList();
        Node reverseNodeHead = reverseList.reverse(head);
        MyList.printList(reverseNodeHead);
        MyList.printList(head);

        head = MyList.generateSingleLinkedList();
        reverseList.reverseUsingRecursion(null, head);
        MyList.printList(reverseList.head);

    }
}
