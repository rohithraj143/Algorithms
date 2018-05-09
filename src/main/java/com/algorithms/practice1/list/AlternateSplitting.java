package com.algorithms.practice1.list;

public class AlternateSplitting {

    private Node list1;
    private Node list2;

    private void split(Node head) {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            list1 = head;
            list2 = null;
            return;
        }

        list1 = head;
        list2 = head.next;
        Node curr = head, temp;

        while (curr != null && curr.next != null) {
            temp = curr.next;
            curr.next = curr.next.next;
            curr = temp;
        }
    }

    public static void main(String[] args) {
        AlternateSplitting splitting = new AlternateSplitting();
        Node head = MyList.generateSingleLinkedList();
        MyList.printList(head);
        splitting.split(head);
        MyList.printList(splitting.list1);
        MyList.printList(splitting.list2);
    }
}
