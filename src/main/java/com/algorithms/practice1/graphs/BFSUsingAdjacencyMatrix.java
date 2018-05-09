package com.algorithms.practice1.graphs;

public class BFSUsingAdjacencyMatrix {

    public void bfs(int[][] adjacencyMatrix, int src, int[] visited) {
        visited[src] = 1;
        Queue queue = new Queue();
        queue.push(src);
        while (!queue.isEmpty()) {
            Node node = queue.pop();
            int rowIndex = node.data;
            System.out.print(rowIndex + " ");
            for (int i = 0; i < visited.length; i++) {
                if (adjacencyMatrix[rowIndex][i] == 1 && visited[i] == 0) {
                    queue.push(i);
                    visited[i] = 1;
                }
            }
        }
    }
}
