package com.algorithms.practice1.trees;

public class Node {

    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getSize() {
        Node node = this;
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        int left = 0, right = 0;
        if (node.left != null) {
            left = node.left.getSize();
        }
        if (node.right != null) {
            right = node.right.getSize();
        }

        return 1 + left + right;
    }

}
