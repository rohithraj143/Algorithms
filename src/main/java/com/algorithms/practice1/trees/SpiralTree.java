package com.algorithms.practice1.trees;

import java.util.Stack;

public class SpiralTree {

    private void printSpiral(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                Node node = stack1.pop();
                System.out.print(node.data+ " ");
                if (node.right != null) {
                    stack2.push(node.right);
                }
                if (node.left != null) {
                    stack2.push(node.left);
                }
            }
            System.out.println();

            while (!stack2.isEmpty()) {
                Node node = stack2.pop();
                System.out.print(node.data + " ");
                if (node.left != null) {
                    stack1.push(node.left);
                }
                if (node.right != null) {
                    stack1.push(node.right);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node node = MyTree.customBuildTree();
        SpiralTree spiralTree = new SpiralTree();
        spiralTree.printSpiral(node);
    }
}
