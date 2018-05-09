package com.algorithms.practice1.graphs;

public class BreadthFirstTraversal {

    public void breadthFirstTraversal(Graph graph,
                                      BreadthFirstSearch breadthFirstSearch,
                                      int v, int[] visited) {
        for (int i = 0; i < v; i++) {
            if (visited[i] == 0) {
                breadthFirstSearch.bfs(graph, v, visited);
            }
        }
    }

    public void bftUsingAdjacencyMatrix(
            int[][] adjacencyMatrix, BFSUsingAdjacencyMatrix bfs
            ,int v) {
        int[] visited = new int[v];

        for(int i = 0; i< v; i++) {

            if(visited[i] == 0) {
                bfs.bfs(adjacencyMatrix, i, visited);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V= 10;
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.print();

        BreadthFirstTraversal bft = new BreadthFirstTraversal();
        bft.bftUsingAdjacencyMatrix(graph.getAdjacencyMatrix(), new BFSUsingAdjacencyMatrix(), V);
    }
}
