package com.algorithms.practice1.trees;

import java.util.Arrays;

public class BST {

    private static int k = -1;

    public static Node getBST(Node node) {
        int size = MyTree.getSize(node);
        int[] arr = new int[size];
        buildArray(node, arr);
        Arrays.sort(arr);
        k = -1;

        return buildBST(node, arr);
    }

    private static Node buildBST(Node node, int[] arr) {
        if (node == null) {
            return null;
        }

        node.left = buildBST(node.left, arr);
        node.data = arr[++k];
        node.right = buildBST(node.right, arr);

        return node;
    }

    private static void buildArray(Node node, int[] arr) {
        if (node == null) {
            return;
        }

        arr[++k] = node.data;
        buildArray(node.left, arr);
        buildArray(node.right, arr);
    }

    public static void main(String[] args) {
        Node node = MyTree.buildTree();
        Node tree = BST.getBST(node);
        MyTree.printTree(tree);
    }
}
