/**
 * @author Rohith Raj 3/5/2018
 */
package com.algorithms.practice1;

//Node root = new Node(10);
//        root.left = new Node(-2);
//        root.left.left = new Node(8);
//        root.left.right = new Node(-4);
//        root.right = new Node(7);


class Node {
    int data, height;
    Node left, right;

    Node(int item) {
        data = item;
        height = 0;
        left = right = null;
    }
}

class GfG {


}