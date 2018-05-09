package com.algorithms.practice1.trees;

public class TopView {

    class HeadNode {
        int hd;
        HeadNode left, right;
        Node node;

        HeadNode(int hd) {
            this.hd = hd;
        }
    }

    private void buildDLL(Node root, HeadNode headNode, int hd) {
        if (root == null) {
            return;
        }

        if (headNode.node == null) {
            headNode.node = root;
        }

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

    private void print(HeadNode headNode) {
        while (headNode != null) {
            System.out.println(headNode.node.data);
            headNode = headNode.right;
        }
    }

    public static void main(String[] args) {

        Node node = MyTree.buildTree();
        TopView topView = new TopView();
        HeadNode headNode = topView.new HeadNode(0);
        topView.buildDLL(node, headNode, 0);
        HeadNode head = topView.getHead(headNode);

        topView.print(head);
    }

}
