package com.algorithms.practice1.trees;

public class BuildPreInOrderTree {

    class Index {
        int idx;
    }


    private int search(int[] in, int start, int end, int key) {

        for (int i = start; i <= end; i++) {
            if (in[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public Node buildTree(int[] in, int[] pre, int start, int end, Index index) {

        if (start > end) {
            return null;
        }

        Node node = new Node(pre[index.idx]);
        index.idx++;

        int inIndex = search(in, start, end, node.data);

        if (start == end) {
            return node;
        }

        node.left = buildTree(in, pre, start, inIndex - 1, index);
        node.right = buildTree(in, pre, inIndex + 1, end, index);

        return node;
    }

    public static void main(String[] args) {

        BuildPreInOrderTree tree = new BuildPreInOrderTree();

        int[] in = {8,4,2,5,1,6,3,7};
        int[] pre = {1,2,4,8,5,3,6,7};

        Index index = new BuildPreInOrderTree().new Index();
        Node node = tree.buildTree(in, pre, 0, pre.length - 1, index);
        MyTree.printTree(node);
    }
}
