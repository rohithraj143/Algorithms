package com.algorithms.practice1.trees;

public class MyTree {

    public static int getSize(Node node) {
        return (node != null) ? (1 + getSize(node.left) + getSize(node.right)) : 0;
    }

    public static void printTree(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        printTree(node.left);
        printTree(node.right);
    }

    public static Node customBuildTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);
        root.left.left.left.left = new Node(5);
        root.left.left.left.left.left = new Node(6);

        root.left.right = new Node(7);
        root.left.right.right = new Node(8);
        root.left.right.right.right = new Node(9);
        root.left.right.right.right.right = new Node(10);
        root.left.right.left = new Node(11);

        root.left.left.left.right = new Node(12);
        root.left.left.left.left.right = new Node(13);

        root.right = new Node(14);
        root.right.right = new Node(15);
        root.right.left = new Node(16);

        return root;
    }

    public static Node buildTree() {
        Node root = new Node(7);
        root.right = new Node(8);
        root.right.right = new Node(9);
        root.right.right.right = new Node(10);
        root.right.right.right.right = new Node(11);

        return root;
    }
}
