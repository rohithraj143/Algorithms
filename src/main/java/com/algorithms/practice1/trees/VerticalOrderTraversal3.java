package com.algorithms.practice1.trees;

public class VerticalOrderTraversal3 {

    public class HeadNode {
        int hd;
        HeadNode left, right;
        Entry list;

        HeadNode(int hd) {
            this.hd = hd;
            this.left = null;
            this.right = null;
            this.list = null;
        }
    }

    public class Entry {
        int data;
        Entry next;

        Entry(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void buildDLL(Node root, HeadNode headNode, int hd) {
        if (root == null) {
            return;
        }

        Entry e = new Entry(root.data);
        e.next = headNode.list;
        headNode.list = e;

        if (root.left != null) {
            if (headNode.left == null) {
                headNode.left = new HeadNode(hd - 1);
                headNode.left.right = headNode;
            }
            buildDLL(root.left, headNode.left, hd - 1);
        }

        if (root.right != null) {
            if (headNode.right == null) {
                headNode.right = new HeadNode(hd + 1);
                headNode.right.left = headNode;
            }
            buildDLL(root.right, headNode.right, hd + 1);
        }
    }

    private HeadNode getHead(HeadNode headNode) {
        if (headNode == null) {
            return null;
        }
        HeadNode head = null;
        while (headNode != null) {
            head = headNode;
            headNode = headNode.left;
        }

        return head;
    }

    private void print(HeadNode head) {
        while (head != null) {
            Entry list = head.list;
            while (list != null) {
                System.out.print(list.data + " ");
                list = list.next;
            }
            head = head.right;
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Node node = MyTree.customBuildTree();
        VerticalOrderTraversal3 orderTraversal3 = new VerticalOrderTraversal3();
        HeadNode headNode = orderTraversal3.new HeadNode(0);
        orderTraversal3.buildDLL(node, headNode, 0);
        HeadNode head = orderTraversal3.getHead(headNode);

        orderTraversal3.print(head);
    }
}
