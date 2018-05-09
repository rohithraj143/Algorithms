package com.algorithms.practice1.trees;

public class SumTree {

    private boolean isSumTree(Node root) {
        if (root == null) {
            return false;
        }

        int sum = checkSumTree(root);
        return (sum - root.data == root.data);
    }

    private int checkSumTree(Node root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.data;
        }

        int left = checkSumTree(root.left);
        int right = checkSumTree(root.right);
        if (left + right == root.data) {
            return 2 * root.data;
        }
        return root.data + left + right;
    }

    public static void main(String[] args) {
        Node node = MyTree.buildTree();

        SumTree sumTree = new SumTree();
        System.out.println(sumTree.isSumTree(node));
    }
}
