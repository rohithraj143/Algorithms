package com.algorithms.practice1.trees;

public class IdenticalTrees {

    public boolean areIdentical(Node node1, Node node2) {

        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return (node1.data == node2.data) && (areIdentical(node1.left, node2.left)) &&
                (areIdentical(node1.right, node2.right));
    }

    public static void main(String[] args) {

        Node node1 = MyTree.buildTree();
        Node node2 = MyTree.buildTree();

        IdenticalTrees identicalTrees = new IdenticalTrees();

        System.out.println(identicalTrees.areIdentical(node1, node2));

        node2.right.right = null;

        System.out.println(identicalTrees.areIdentical(node1, node2));

    }
}
