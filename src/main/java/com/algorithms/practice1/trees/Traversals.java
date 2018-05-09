package com.algorithms.practice1.trees;

public class Traversals {

    public void preOrder(Node node) {

        if(node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node node) {

        if(node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }


    public void postOrder(Node node) {

        if(node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }


    public static void main(String[] args) {

        Traversals traversals = new Traversals();
        Node root = MyTree.buildTree();

        traversals.preOrder(root);
        System.out.println();
        traversals.postOrder(root);
        System.out.println();
        traversals.inOrder(root);

    }

}
