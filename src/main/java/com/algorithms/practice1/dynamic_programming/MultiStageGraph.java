package com.algorithms.practice1.dynamic_programming;

import com.algorithms.practice1.graphs.AdjacencyMatrixGraph;

public class MultiStageGraph {

    private int getMinimumPathDistance(AdjacencyMatrixGraph graph) {
        int v = graph.getV();
        int[] T = new int[v];
        T[v - 1] = 0;

        for (int i = v - 2; i >= 0; i--) {
            T[i] = Integer.MAX_VALUE/5;
            for (int j = i + 1; j < v; j++) {
                int q = (graph.getEdge(i, j) != 0 ? graph.getEdge(i, j) : Integer.MAX_VALUE/5) + T[j];
                if (q < T[i]) {
                    T[i] = q;
                }
            }
        }

        return T[0];
    }

    public static void main(String[] args) {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(8);
        graph.addEdgeWithWeight(0, 1, 1);
        graph.addEdgeWithWeight(0, 2, 2);
        graph.addEdgeWithWeight(0, 3, 5);
        graph.addEdgeWithWeight(1, 4, 4);
        graph.addEdgeWithWeight(1, 5, 11);
        graph.addEdgeWithWeight(2, 4, 9);
        graph.addEdgeWithWeight(2, 5, 5);
        graph.addEdgeWithWeight(2, 6, 6);
        graph.addEdgeWithWeight(3, 6, 2);
        graph.addEdgeWithWeight(4, 7, 18);
        graph.addEdgeWithWeight(5, 7, 13);
        graph.addEdgeWithWeight(6, 7, 2);

        graph.print();

        MultiStageGraph graph1 = new MultiStageGraph();
        System.out.println(graph1.getMinimumPathDistance(graph));
    }
}
