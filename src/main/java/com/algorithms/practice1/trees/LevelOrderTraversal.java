package com.algorithms.practice1.trees;

import java.util.LinkedList;

public class LevelOrderTraversal {

    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue queue = new Queue();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

        }
    }

    public void levelOrderUsingQueueInBuild(Node node) {

        if (node == null) {
            return;
        }

        System.out.println();
        java.util.Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {

            Node node1 = queue.poll();
            System.out.print(node1.data + " ");

            if (node1.left != null) {
                queue.add(node1.left);
            }

            if (node1.right != null) {
                queue.add(node1.right);
            }
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal traversal = new LevelOrderTraversal();
        Node node = MyTree.buildTree();
        MyTree.printTree(node);
        System.out.println();
        traversal.levelOrder(node);

        traversal.levelOrderUsingQueueInBuild(node);
    }
}
