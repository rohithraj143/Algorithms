package com.algorithms.practice1.trees;

public class BBST {

    private Node buildBBST(int[] arr, int low, int high) {
        if (low > high) {
            return null;
        }

        int mid = (low + high) / 2;
        Node root = new Node(arr[mid]);
        root.left = buildBBST(arr, low, mid - 1);
        root.right = buildBBST(arr, mid + 1, high);
        return root;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        BBST bbst = new BBST();
        Node root = bbst.buildBBST(arr, 0, arr.length - 1);
        MyTree.printTree(root);
    }
}
