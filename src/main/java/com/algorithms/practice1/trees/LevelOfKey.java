package com.algorithms.practice1.trees;

public class LevelOfKey {

    private int getLevel(Node root, int key, int level) {
        if (root == null) {
            return -1;
        }

        if(root.data == key) {
            return level;
        }

        int leftLevel = getLevel(root.left, key, level + 1);
        if (leftLevel != -1) {
            return leftLevel;
        }
        return getLevel(root.right, key, level + 1);
    }

    public static void main(String[] args) {
        Node node = MyTree.customBuildTree();
        LevelOfKey l = new LevelOfKey();

        System.out.println(l.getLevel(node, 31, 1));
    }
}
