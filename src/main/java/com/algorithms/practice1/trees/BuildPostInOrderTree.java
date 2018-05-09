package com.algorithms.practice1.trees;

public class BuildPostInOrderTree {

    class Index {
        int idx;
    }

    private int search(int[] in, int key, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (in[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public Node buildTree(int[] po, int[] in, int start, int end, Index index) {

        if (start > end) {
            return null;
        }

        Node node = new Node(po[index.idx]);
        index.idx--;

        if(start == end) {
            return node;
        }

        int inIndex = search(in, node.data, start, end);

        node.right = buildTree(po, in, inIndex + 1, end, index);
        node.left = buildTree(po, in, start, inIndex - 1, index);
        return node;
    }

    public static void main(String[] args) {
        BuildPostInOrderTree tree = new BuildPostInOrderTree();

        int[] po = {8, 4, 5, 2, 6, 7, 3, 1};
        int[] in = {8, 4, 2, 5, 1, 6, 3, 7};

        Index index = new BuildPostInOrderTree().new Index();
        index.idx = po.length-1;

        Node node = tree.buildTree(po, in, 0, po.length - 1, index);
        MyTree.printTree(node);
    }

}
