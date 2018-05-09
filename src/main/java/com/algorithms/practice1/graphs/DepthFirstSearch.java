package com.algorithms.practice1.graphs;

public class DepthFirstSearch {

    public void dfs(Graph graph, int[] visited, int src) {
        visited[src] = 1;
        System.out.print(src+ " ");
        AdjacencyList adjacencyList = graph.getAdjacencyList()[src];
        Node node = adjacencyList.head;
        while(node != null) {
            int data = node.data;
            if(visited[data] == 0) {
                visited[data] = 1;
                dfs(graph, visited, data);
            }
            node = node.next;
        }
    }
}
