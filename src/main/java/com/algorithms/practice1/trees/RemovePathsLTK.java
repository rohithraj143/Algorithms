package com.algorithms.practice1.trees;

public class RemovePathsLTK {

    private int removePaths(Node root, int level, int k) {
        if (root == null) {
            return 0;
        }
        int left = removePaths(root.left, level + 1, k);
        if (left != 0 && left + level < k) {
            root.left = null;
        }
        int right = removePaths(root.right, level + 1, k);
        if (right != 0 && right + level < k) {
            root.right = null;
        }
        return 1 + Math.max(left, right);
    }

    private Node removePath(Node root, int k) {
        if (root == null) {
            return null;
        }

        if (k == 0) {
            return root;
        }
        root.left = removePath(root.left, k - 1);
        root.right = removePath(root.right, k - 1);
        if (root.left == null && root.right == null) {
            root = null;
            return null;
        }
        return root;
    }

    public static void main(String[] args) {
        Node node = MyTree.buildTree();
        MyTree.printTree(node);
        RemovePathsLTK removePathsLTK = new RemovePathsLTK();
        removePathsLTK.removePaths(node, 0, 3);
        System.out.println();
        MyTree.printTree(node);

        node = MyTree.buildTree();
        removePathsLTK.removePath(node, 3);
        System.out.println();
        MyTree.printTree(node);
    }
}
