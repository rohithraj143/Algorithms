package com.algorithms.practice1.search;

import com.algorithms.practice1.list.MyList;
import com.algorithms.practice1.list.Node;

public class LinearSearch {

    private static Node linearSearchUsingLinkedListRecursion(Node node, int target) {

        if (node == null) {
            return null;
        }

        if (node.data == target) {
            return node;
        }

        return linearSearchUsingLinkedListRecursion(node.next, target);
    }

    private static Node linearSearchUsingLinkedList(Node node, int target) {

        if (node != null) {

            while (node != null) {
                if (node.data == target) {
                    return node;
                }

                node = node.next;
            }
        }

        return null;
    }

    private static int linearSearchUsingArraysRecursion(int[] arr, int index, int length, int target) {

        if (arr == null) {
            return -1;
        }

        if (index >= length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }
        return linearSearchUsingArraysRecursion(arr, ++index, length, target);
    }

    private static int linearSearchUsingArrays(int[] arr, int target) {

        if (arr == null) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 345, 43, 56};
        Node head = MyList.generateSingleLinkedList();

        System.out.println(linearSearchUsingArrays(arr, 3));
        System.out.println(linearSearchUsingArrays(arr, 57));

        System.out.println(linearSearchUsingArraysRecursion(arr, 0, 6, 345));
        System.out.println(linearSearchUsingArraysRecursion(arr, 0, 6, 346));

        System.out.println(linearSearchUsingLinkedList(head, 10) != null);
        System.out.println(linearSearchUsingLinkedList(head, 17) != null);

        System.out.println(linearSearchUsingLinkedListRecursion(head, 30) != null);
        System.out.println(linearSearchUsingLinkedListRecursion(head, 346) != null);
    }
}
