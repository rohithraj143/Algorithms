package com.algorithms.practice1.trees;

public class Diameter {

    static int MAX = -1, maxSum = -1;

    public int diameterCustom(Node root) {
        if (root == null) {
            return 0;
        }

        int lHeight = diameterCustom(root.left);
        int rheight = diameterCustom(root.right);

        maxSum = lHeight + rheight + 1;

        if (maxSum > MAX) {
            MAX = maxSum;
        }
        return 1+ Math.max(lHeight, rheight);
    }

    public int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int lheight = height(root.left);
        int rheight = height(root.right);

        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }

        return 1 + Math.max(height(node.left), height(node.right));
    }

    public static void main(String[] args) {
        Node node = MyTree.customBuildTree();
        Diameter d = new Diameter();
        int diameter = d.diameter(node);
        System.out.println(diameter);

        d.diameterCustom(node);
        System.out.println(MAX);
    }
}
