package com.algorithms.practice1.trees;

public class Mirrors {

    public Node mirror(Node node) {
        if (node == null) {
            return null;
        }

        if (node.left == null && node.right == null) {
            return node;
        }

        Node temp = node.left;
        node.left = mirror(node.right);
        node.right = mirror(temp);
        return node;
    }

    public static void main(String[] args) {

        Mirrors mirrors = new Mirrors();
        Node root = MyTree.buildTree();
        MyTree.printTree(root);
        System.out.println();

        Node mirror = mirrors.mirror(root);
        MyTree.printTree(mirror);
    }
}
