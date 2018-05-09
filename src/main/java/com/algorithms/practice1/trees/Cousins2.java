package com.algorithms.practice1.trees;

public class Cousins2 {

    private Node lca(Node root, int x, int y) {
        if (root == null) {
            return null;
        }

        if (root.data == x || root.data == y) {
            return root;
        }

        Node leftNode = lca(root.left, x, y);
        if (leftNode != null && leftNode == root.left) {
            return root;
        }
        Node rightNode = lca(root.right, x, y);
        if (leftNode != null && rightNode != null) {
            return root;
        }
        if (leftNode != null) {
            return leftNode;
        }
        return rightNode;
    }

    private boolean isCousins(Node root, int x, int y) {
        if (root == null) {
            return false;
        }

        Node lca = lca(root, x, y);
        System.out.println(lca.data);
        return lca != null
                && !((lca.left.data == x && lca.right.data == y)
                || (lca.left.data == y && lca.right.data == x));
    }

    public static void main(String[] args) {
        Node node = MyTree.customBuildTree();
        Cousins2 cousins = new Cousins2();
        System.out.println(cousins.isCousins(node, 2, 14));
    }
}
