///**
// * @author Rohith Raj 3/12/2018
// */
//package com.algorithms;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}
//
//public class Solution {
//    int MAX = -1, leftNodeValue = -1;
//
//    void findBottomLeftValueUtil(TreeNode root, int level) {
//        if (root == null) {
//            return;
//        }
//
//        if (level > MAX) {
//            MAX = level;
//            leftNodeValue = root.val;
//        }
//        findBottomLeftValueUtil(root.left, level + 1);
//        findBottomLeftValueUtil(root.right, level + 1);
//    }
//
//    public int findBottomLeftValue(TreeNode root) {
//        findBottomLeftValueUtil(root, 1);
//        return leftNodeValue;
//    }
//}
