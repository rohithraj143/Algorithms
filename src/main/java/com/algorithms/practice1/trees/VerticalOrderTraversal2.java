package com.algorithms.practice1.trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class VerticalOrderTraversal2 {

    private int MAX = 0, MIN = 0;
    private static Map<Integer, LinkedList<Node>> hm = new HashMap<>();

    private void traversal(Node root, Map<Integer, LinkedList<Node>> hm, int hd) {
        if (root == null) {
            return;
        }

        if (hd < MIN) {
            MIN = hd;
        } else if (hd > MAX) {
            MAX = hd;
        }

        if (!hm.containsKey(hd)) {
            LinkedList<Node> l = new LinkedList<>();
            l.add(root);
            hm.put(hd, l);
        } else {
            hm.get(hd).add(root);
        }

        traversal(root.left, hm, hd - 1);
        traversal(root.right, hm, hd + 1);
    }

    private void print() {
        for (int i = MIN; i <= MAX; i++) {
            LinkedList<Node> nodes = hm.get(i);
            for(Node n : nodes) {
                System.out.print(n.data + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node node = MyTree.customBuildTree();
        VerticalOrderTraversal2 orderTraversal2 = new VerticalOrderTraversal2();
        orderTraversal2.traversal(node, hm, 0);
        orderTraversal2.print();
    }
}
