package com.algorithms.practice1.trees;

public class Size {

    public int getSize(Node node) {
        return (node != null) ? (1 + getSize(node.left) + getSize(node.right)) : 0;
    }

    public static void main(String[] args) {
        Node root = MyTree.buildTree();

        Size size = new Size();
        System.out.println("Size is " + size.getSize(root));

    }

}
