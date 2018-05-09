/**
 * @author Rohith Raj 4/27/2018
 */
package com.algorithms.practice1;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ComparatorHelp {
    private static int k = 0;

    static class IntValueComparator<K, V extends Comparable<V>> implements Comparator<K> {

        Map<K, V> map = new TreeMap<K, V>();

        IntValueComparator(Map<K, V> map) {
            this.map.putAll(map);
        }

        @Override
        public int compare(K o1, K o2) {
            Integer key1 = (Integer) o1;
            Integer key2 = (Integer) o2;

            int val1 = (Integer) map.get(key1);
            int val2 = (Integer) map.get(key2);

            if(val1 <= val2) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    private static Node buildTree(int[][] arr, int r, int c) {
        Map<Integer, Integer> m = new TreeMap<>();
        Node root = null;
        Node[] nodeArr = new Node[r];
        boolean[] visited = new boolean[r];
        for (int i = 0; i < r; i++) {
            int count = 0;
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            m.put(i, count);
        }

        Map<Integer, Integer> mapByCount = new TreeMap<>(new IntValueComparator<Integer, Integer>(m));
        mapByCount.putAll(m);
        m = mapByCount;
        for (Integer row : m.keySet()) {
            int count = m.get(row);
            root = new Node(row);
            nodeArr[row] = root;
            if (count != 0) {
                for (int i = 0; i < c; i++) {
                    if (arr[row][i] == 1 && !visited[i]) {
                        if (root.left == null) {
                            root.left = nodeArr[i];
                        } else {
                            root.right = nodeArr[i];
                        }
                        visited[i] = true;
                    }
                }
            }
        }
        return root;
    }

    private static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printInorder(root.left);
        printInorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();

        while (var-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] arr = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
                }

            }

            Node root = buildTree(arr, r, c);
            printInorder(root);
        }
        sc.close();
    }
}
