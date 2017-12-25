package com.algorithms.graphs;

public class DirectedGraph {

    private int V;
    private AdjacencyList[] adjacencyList;

    public DirectedGraph(int V) {
        this.V = V;
        adjacencyList = new AdjacencyList[V];
    }

    public boolean addEdge(int src, int dest) {

        if (adjacencyList[src] == null) {
            adjacencyList[src] = new AdjacencyList();
        }

        if (src > this.V || dest > this.V) {
            return false;
        }
        this.adjacencyList[src].add(dest);
        return true;
    }

    public void print() {
        AdjacencyList adjacencyList;
        for (int i = 0; i < this.V; i++) {
            adjacencyList = this.adjacencyList[i];
            if (adjacencyList != null) {
                adjacencyList.printAdjacencyList(adjacencyList.head, i);
                System.out.println();
            }
        }
    }

    public boolean deleteEdge(int src, int dest) {
        return src <= this.V && dest <= this.V && adjacencyList[src].delete(dest);
    }

    public void deleteVertex(int src) {
        adjacencyList[src] = null;
    }

    public int getV() {
        return V;
    }

    public AdjacencyList[] getAdjacencyList() {
        return adjacencyList;
    }

    public static void main(String[] args) {
        int V = 10;
        DirectedGraph graph = new DirectedGraph(V);
        graph.addEdge(2, 1);
        graph.addEdge(5, 1);
        graph.addEdge(1, 3);
        graph.addEdge(1, 7);
        graph.addEdge(7, 3);
        graph.addEdge(3, 6);
        graph.addEdge(7, 6);

        graph.print();
    }
}
