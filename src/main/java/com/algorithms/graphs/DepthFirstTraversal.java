package com.algorithms.graphs;

public class DepthFirstTraversal {

    public void dft(Graph graph, int[] visited, DepthFirstSearch dfs) {

        for(int i = 0; i < visited.length; i++) {
            if(visited[i] == 0) {
                dfs.dfs(graph, visited, i);
            }
        }
    }

    public static void main(String[] args) {
        int V = 10;
        Graph graph = new Graph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(0, 7);

        graph.print();

        DepthFirstTraversal dft = new DepthFirstTraversal();
        int[] visited = new int[V];
        dft.dft(graph, visited, new DepthFirstSearch());
    }
}
