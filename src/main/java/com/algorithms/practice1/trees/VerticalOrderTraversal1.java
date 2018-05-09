package com.algorithms.practice1.trees;

public class VerticalOrderTraversal1 {

    private int MAX = 0, MIN = 0;

    private void range(Node root, int hd) {
        if (root == null) {
            return;
        }

        if (hd < MIN) {
            MIN = hd;
        } else if (hd > MAX) {
            MAX = hd;
        }

        range(root.left, hd - 1);
        range(root.right, hd + 1);
    }

    private void traverse(Node root, int hd, int level) {
        if (root == null) {
            return;
        }

        if (level == hd) {
            System.out.print("Nodes at HD " + level + " are -> " + root.data + " ");
        }

        traverse(root.left, hd, level - 1);
        traverse(root.right, hd, level + 1);
    }

    private void verticalOrderTraversal(Node root) {
        range(root, 0);
        for (int i = MIN; i <= MAX; i++) {
            traverse(root, i, 0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        VerticalOrderTraversal1 orderTraversal1 = new VerticalOrderTraversal1();
        Node node = MyTree.customBuildTree();

        orderTraversal1.verticalOrderTraversal(node);
    }
}
