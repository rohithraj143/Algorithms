package com.algorithms.practice1.trees;

public class Cousins1 {

    private int getLevel(Node root, int key, int level) {
        if (root == null) {
            return -1;
        }
        if (root.data == level) {
            return level;
        }
        int leftLevel = getLevel(root.left, key, level + 1);
        if (leftLevel != -1) {
            return leftLevel;
        }
        return getLevel(root.right, key, level + 1);
    }

    private boolean isSibling(Node root, int x, int y) {
        if (root == null) {
            return false;
        }
        if (root.left != null && root.right != null
                && ((root.left.data == x && root.right.data == y)
                || (root.left.data == y && root.right.data == x))) {
            return true;
        }
        return isSibling(root.left, x, y) || isSibling(root.right, x, y);
    }

    private boolean isCousins(Node root, int x, int y) {
        return root != null
                && (getLevel(root, x, 1) == getLevel(root, y, 1)
                && !isSibling(root, x, y));
    }

    public static void main(String[] args) {
        Node node = MyTree.customBuildTree();
        Cousins1 cousins = new Cousins1();
        System.out.println(cousins.isCousins(node, 2, 14));
    }
}
