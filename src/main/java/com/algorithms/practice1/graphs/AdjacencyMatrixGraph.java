package com.algorithms.practice1.graphs;

public class AdjacencyMatrixGraph {
    public int V;
    private int[][] adjacencyMatrix;

    public AdjacencyMatrixGraph(int V) {
        this.V = V;
        adjacencyMatrix = new int[V][V];
    }

    public void addEdge(int src, int dest) {
        if (src > V || dest > V) {
            return;
        }
        adjacencyMatrix[src][dest] = 1;
        adjacencyMatrix[dest][src] = 1;
    }

    public void addEdgeWithWeight(int src, int dest, int weight) {
        if (src > V || dest > V) {
            return;
        }
        adjacencyMatrix[src][dest] = weight;
    }

    public int getEdge(int src, int dest) {
        return adjacencyMatrix[src][dest];
    }

    public void print() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
    }

    public void deleteEdge(int src, int dest) {
        if (src > V || dest > V) {
            return;
        }
        adjacencyMatrix[src][dest] = 0;
        adjacencyMatrix[dest][src] = 0;
    }

    public void deleteVertex(int vertex) {
        if (vertex > V) {
            return;
        }
        for (int i = 0; i < V; i++) {
            if (adjacencyMatrix[vertex][i] != 0) {
                adjacencyMatrix[vertex][i] = 0;
                adjacencyMatrix[i][vertex] = 0;
            }
        }
    }

    public int getV() {
        return V;
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }
}
