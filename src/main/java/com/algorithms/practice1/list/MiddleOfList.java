package com.algorithms.practice1.list;

public class MiddleOfList {

    private Node middle(Node node) {
        if (node == null) {
            return null;
        }
        if (node.next == null) {
            return node;
        }
        Node sp = node, fp = node;
        while (fp.next != null && fp.next.next != null) {
            fp = fp.next.next;
            sp = sp.next;
        }
        return sp;
    }

    public static void main(String[] args) {
        MiddleOfList m = new MiddleOfList();
        Node node = m.middle(MyList.generateSingleLinkedList());
        System.out.println(node.data);
    }
}
