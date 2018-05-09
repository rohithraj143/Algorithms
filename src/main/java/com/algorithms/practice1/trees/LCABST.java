package com.algorithms.practice1.trees;

public class LCABST {

    private int getSize(Node root) {
        return (root != null) ? (1 + getSize(root.left) + getSize(root.right)) : 0;
    }

    private int getPathIndex(Node node, Node[] arr, int p) {
        int i = -1;

        while (node != null) {
            arr[++i] = node;
            if (p == node.data) {
                break;
            } else if (p < node.data) {
                node = node.left;
            } else {
                node = node.right;
            }
        }

        if (node == null) {
            return -1;
        }
        return i;
    }

    public Node getLCA(Node root, int p, int q) {
        if (root == null) {
            return null;
        }

        int size = getSize(root);
        Node[] arr1 = new Node[size], arr2 = new Node[size];
        int i = getPathIndex(root, arr1, p),
                j = getPathIndex(root, arr2, q),
                maxIter = Math.min(i, j);
        Node hca = null;

        for (int k = 0; k <= maxIter; k++) {
            if (arr1[k] != arr2[k]) {
                break;
            }
            hca = arr1[k];
        }
        return hca;
    }

    private Node getLCAWithoutPath(Node node, int p, int q) {

        if (node == null) {
            return null;
        } else if (node.data > p && node.data > q) {
            return getLCAWithoutPath(node.left, p, q);
        } else if (node.data < p && node.data < q) {
            return getLCAWithoutPath(node.right, p, q);
        }
        return node;
    }

    private Node getLCAIterative(Node node, int p, int q) {
        while (node != null) {
            if (node.data > p && node.data > q) {
                node = node.left;
            } else if (node.data < p && node.data < q) {
                node = node.right;
            } else {
                return node;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LCABST lca = new LCABST();
        Node bstNode = BST.getBST(MyTree.buildTree());
        Node node1 = lca.getLCA(bstNode, 1, 2);
        System.out.println(node1.data);

        Node lcaWithoutPath = lca.getLCAWithoutPath(bstNode, 5, 7);
        System.out.println(lcaWithoutPath.data);

        Node lcaIterative = lca.getLCAIterative(bstNode, 5, 7);
        System.out.println(lcaIterative.data);
    }
}
