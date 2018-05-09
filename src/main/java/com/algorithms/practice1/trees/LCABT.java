package com.algorithms.practice1.trees;

public class LCABT {

    private Node getLCA(Node node, int p, int q) {
        if (node == null) {
            return null;
        }

        if (node.data == p || node.data == q) {
            return node;
        }

        Node left = getLCA(node.left, p, q);
        if (left != null && left.data == node.left.data) {
            return left;
        }
        Node right = getLCA(node.right, p, q);
        if (left != null && right != null) {
            return node;
        } else if (left != null) {
            return left;
        }
        return right;
    }

    public static void main(String[] args) {
        Node node = MyTree.customBuildTree();
        MyTree.printTree(node);
        System.out.println();
        LCABT lcabt = new LCABT();
        Node lca = lcabt.getLCA(node, 19, 10);
        System.out.println(lca.data);
    }
}
