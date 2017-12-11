package com.algorithms.recursion;

import com.algorithms.list.MyList;
import com.algorithms.list.Node;

public class ReverseSingleLinkedList {

    private static Node head;

    private static void reverseList(Node prev, Node curr) {

        if(curr != null) {
            reverseList(curr, curr.next);
            curr.next = prev;
        } else {
            head = prev;
        }
    }

    public static void main(String[] args) {
        head = MyList.generateSingleLinkedList();
        reverseList(null, head);
        System.out.println(head);

    }
}
