package com.algorithms.practice1.trees;

public class PrintKDsitanceNodes {


    private int printKNodes(Node root, int key, int k) {
        if (root == null) {
            return -1;
        }

        if (root.data == key) {
            printNodes(root.left, 0, k - 1);
            printNodes(root.right, 0, k - 1);
            return 1;
        }

        int k1 = printKNodes(root.left, key, k);
        if (k1 != -1) {
            printNodes(root.right, 0, k - (k1 + 1));
            return k1 + 1;
        }
        int k2 = printKNodes(root.right, key, k);
        if (k2 != -1) {
            printNodes(root.left, 0, k - (k2 + 1));
            return k2 + 1;
        }
        return -1;
    }

    private void printNodes(Node root, int level, int distance) {

        if (root == null) {
            return;
        }

        if (level == distance) {
            System.out.println(root.data);
            return;
        }
        printNodes(root.left, level + 1, distance);
        printNodes(root.right, level + 1, distance);
    }

    public static void main(String[] args) {
        Node node = MyTree.buildTree();
        PrintKDsitanceNodes printKDsitanceNodes = new PrintKDsitanceNodes();
        printKDsitanceNodes.printNodes(node, 0, 2);

        Node node1 = MyTree.customBuildTree();
        printKDsitanceNodes.printKNodes(node1, 3, 3);
    }
}
