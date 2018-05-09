package com.algorithms.practice1.graphs;

public class TopologicalSort {

    private void topologicalSort(DirectedGraph graph, int index, int[] dependencyArray) {
        AdjacencyList adjacencyList = graph.getAdjacencyList()[index];
        if (adjacencyList == null) {
            dependencyArray[index] = -1;
            return;
        }
        Node node = adjacencyList.head;
        while (node != null) {
            dependencyArray[node.data] = dependencyArray[node.data] + 1;
            node = node.next;
        }
    }




    public void sort(DirectedGraph graph) {
        if(graph == null) {
            return;
        }

        int size = graph.getV();
        int[] dependencyArray = new int[size];
        Queue queue = new Queue();

        for (int i = 0; i < size; i++) {
            topologicalSort(graph, i, dependencyArray);
        }

        for(int i = 0; i < size; i++) {
            if(dependencyArray[i] == 0) {
                queue.push(i);
            }
        }

        while(!queue.isEmpty()) {

        }
    }

}
