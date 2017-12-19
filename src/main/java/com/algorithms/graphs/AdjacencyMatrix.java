package com.algorithms.graphs;

public class AdjacencyMatrix {

    public static void main(String[] args) {
        int V = 10;
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.print();

        graph.addEdge(8,1);
        graph.print();

        graph.deleteEdge(8,1);
        graph.print();

        graph.deleteVertex(0);
        graph.print();
    }
}
