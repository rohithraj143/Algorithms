package com.algorithms.practice1.trees;

public class LeftView {

    private int MAX = 0;

    private void printLeftView(Node root, int level) {
        if (root == null) {
            return;
        }
        if (MAX < level) {
            System.out.println(root.data);
            MAX++;
        }
        printLeftView(root.left, level + 1);
        printLeftView(root.right, level + 1);
    }

    public static void main(String[] args) {
        Node node = MyTree.buildTree();
        LeftView view = new LeftView();
        view.printLeftView(node, 1);
    }

}
