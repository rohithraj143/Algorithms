package com.algorithms.practice1.trees;

public class SubTreeOfMainTree {

    private boolean search(Node root1, Node root2, int key) {
        if (root1 == null) {
            return false;
        }

        if (root1.data == key) {
            return checkIdentical(root1, root2);
        }
        return search(root1.left, root2, key) || search(root1.right, root2, key);
    }

    private boolean checkIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.data == root2.data)
                && checkIdentical(root1.left, root2.left)
                && checkIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        SubTreeOfMainTree subTreeOfMainTree= new SubTreeOfMainTree();
        Node root2 = MyTree.buildTree();
        Node root1 = MyTree.customBuildTree();

        System.out.println(subTreeOfMainTree.search(root1, root2, root2.data));
    }
}
