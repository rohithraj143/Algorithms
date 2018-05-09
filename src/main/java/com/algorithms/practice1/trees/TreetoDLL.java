package com.algorithms.practice1.trees;

public class TreetoDLL {

    private Node getTail(Node node) {
        while (node != null && node.right != null) {
            node = node.right;
        }
        return node;
    }

    private Node getHead(Node node) {
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }

    private Node treetoDLL(Node node) {
        if (node == null) {
            return null;
        }

        if (node.left == null && node.right == null) {
            return node;
        }
        Node left = treetoDLL(node.left);
        Node right = treetoDLL(node.right);

        Node leftNode = getTail(left);
        Node rightNode = getHead(right);

        node.left = leftNode;
        node.right = rightNode;

        if (leftNode != null) {
            leftNode.right = node;
        }
        if (rightNode != null) {
            rightNode.left = node;
        }

        return node;
    }

    private Node anotherWay(Node node) {
        if (node.left != null) {
            Node ltree = anotherWay(node.left);
            for (; ltree != null && ltree.right != null; ltree = ltree.right) ;
            ltree.right = node;
            node.left = ltree;
        }
        if (node.right != null) {
            Node rtree = anotherWay(node.right);
            for (; rtree != null && rtree.left != null; rtree = rtree.left) ;
            rtree.left = node;
            node.right = rtree;
        }
        return node;
    }

    public static void main(String[] args) {
        TreetoDLL tree = new TreetoDLL();
        Node node = MyTree.buildTree();
        Node node1 = tree.treetoDLL(node);
        Node head = tree.getHead(node1);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.right;
        }

        node = MyTree.buildTree();
        node1 = tree.anotherWay(node);
        head = tree.getHead(node1);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.right;
        }
    }
}
