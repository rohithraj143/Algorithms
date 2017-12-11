package com.algorithms.list;

public class DeleteNode {


    private Node deleteNodeFromBeginning(Node head) {
        if(head == null) {
            return null;
        }

        if(head.getNext() != null) {
            Node next = head.getNext();
            head = null;
            return next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        
        Node head = MyList.generateSingleLinkedList();
        
        Node newHead = new DeleteNode().deleteNodeFromBeginning(head);

        System.out.println(newHead);
    }
}
