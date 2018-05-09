package com.algorithms.practice1.graphs;

public class Graph {

    private int V;
    private AdjacencyList[] adjacencyList;

    public Graph(int V) {
        this.V = V;

        adjacencyList = new AdjacencyList[V];

        for (int i = 0; i < V; i++) {
            adjacencyList[i] = new AdjacencyList();
        }
    }

    public boolean addEdge(int src, int dest) {
        if (src > this.V || dest > this.V) {
            return false;
        }
        this.adjacencyList[src].add(dest);
        this.adjacencyList[dest].add(src);
        return true;
    }

    public void print() {
        AdjacencyList adjacencyList;
        for (int i = 0; i < this.V; i++) {
            adjacencyList = this.adjacencyList[i];
            if (adjacencyList != null && adjacencyList.head != null) {
                adjacencyList.printAdjacencyList(adjacencyList.head, i);
                System.out.println();
            }

        }
    }

    public boolean deleteEdge(int src, int dest) {
        if (src > this.V || dest > this.V) {
            return false;
        }
        AdjacencyList adjacencyList1, adjacencyList2;
        adjacencyList1 = this.adjacencyList[src];
        adjacencyList2 = this.adjacencyList[dest];

        return adjacencyList1.delete(dest) && adjacencyList2.delete(src);
    }

    public void deleteVertex(int src) {
        for (int i = 0; i < V; i++) {
            if (i == src) {
                adjacencyList[src] = null;
            } else {
                AdjacencyList adjacencyList = this.adjacencyList[i];
                adjacencyList.delete(src);
            }
        }
    }

    public int getV() {
        return V;
    }

    public AdjacencyList[] getAdjacencyList() {
        return adjacencyList;
    }
}
