package com.algorithms.graphs;

public class TopologicalSortUsingStack {

    public void topologicalSort(DirectedGraph graph) {
        if (graph == null) {
            return;
        }
        int size = graph.getV();
        int[] visited = new int[size];
        Stack stack = new Stack();
        for (int i = 0; i < size; i++) {
            AdjacencyList adjacencyList = graph.getAdjacencyList()[i];
            if (adjacencyList != null && visited[i] == 0) {
                topologicalSortUtil(graph, visited, i, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().data + " ");
        }
    }

    private void topologicalSortUtil(DirectedGraph graph, int[] visited, int i, Stack stack) {
        visited[i] = 1;

        AdjacencyList adjacencyList = graph.getAdjacencyList()[i];

        Node node = adjacencyList == null ? null : adjacencyList.head;
        while (node != null) {
            int data = node.data;
            if (visited[data] == 0) {
                visited[data] = 1;
                topologicalSortUtil(graph, visited, data, stack);
            }
            node = node.next;
        }
        stack.push(i);
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

        TopologicalSortUsingStack topSort = new TopologicalSortUsingStack();
        topSort.topologicalSort(graph);
    }
}
