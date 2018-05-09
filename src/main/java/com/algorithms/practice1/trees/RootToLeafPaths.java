package com.algorithms.practice1.trees;

public class RootToLeafPaths {

    private void printPath(Node root, int[] path, int level) {
        if (root == null) {
            return;
        }
        path[level] = root.data;
        if (root.left == null && root.right == null) {
            print(path, level);
            return;
        }
        printPath(root.left, path, level + 1);
        printPath(root.right, path, level + 1);
    }

    private void print(int[] arr, int level) {
        for (int i = 0; i <= level; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RootToLeafPaths rootToLeafPaths = new RootToLeafPaths();
        Node node = MyTree.customBuildTree();
        int size = node.getSize();
        int[] arr = new int[size];
        rootToLeafPaths.printPath(MyTree.customBuildTree(), arr, 0);
    }
}
