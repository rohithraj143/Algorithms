package com.algorithms.practice1.trees;

public class VerticalOrderSum {

    public class HeadNode {
        int hd;
        int sum;
        HeadNode left, right;

        HeadNode(int hd) {
            this.hd = hd;
            this.sum = sum;
            this.left = null;
            this.right = null;
        }
    }

    private void buildDLL(Node root, HeadNode headNode, int hd) {
        if (root == null) {
            return;
        }

        headNode.sum += root.data;

        if (root.left != null) {
            if (headNode.left == null) {
                headNode.left = new HeadNode(hd - 1);
                headNode.left.right = headNode;
            }
            buildDLL(root.left, headNode.left, hd - 1);
        }

        if (root.right != null) {
            if (headNode.right == null) {
                headNode.right = new HeadNode(hd + 1);
                headNode.right.left = headNode;
            }
            buildDLL(root.right, headNode.right, hd + 1);
        }
    }

    private HeadNode getHead(HeadNode headNode) {
        HeadNode head = null;
        while (headNode != null) {
            head = headNode;
            headNode = headNode.left;
        }
        return head;
    }

    private void printSum(HeadNode headNode) {
        while (headNode != null) {
            System.out.println(headNode.sum);
            headNode = headNode.right;
        }
    }

    public static void main(String[] args) {
        Node node = MyTree.buildTree();

        VerticalOrderSum verticalOrderSum = new VerticalOrderSum();
        HeadNode headNode = verticalOrderSum.new HeadNode(0);
        verticalOrderSum.buildDLL(node, headNode, 0);
        HeadNode head = verticalOrderSum.getHead(headNode);

        verticalOrderSum.printSum(head);
    }

}
