package com.algorithms.practice1.graphs;

public class BreadthFirstSearch {

    public void bfs(Graph graph, int v, int[] visited) {
        if(graph == null) {
            return;
        }
        visited[v] = 1;
        System.out.print(v + " ");
        Queue queue = new Queue();
        while(v != Integer.MIN_VALUE) {
            AdjacencyList[] adjacencyListArray = graph.getAdjacencyList();
            AdjacencyList adjacencyList = adjacencyListArray[v];
            Node node = adjacencyList.head;
            while(node != null) {
                int data = node.data;
                if(visited[data] == 0) {
                    queue.push(data);
                    visited[data] = 1;
                }
                node = node.next;
            }

            if(queue.isEmpty()) {
                return;
            }
            Node nextNode = queue.pop();
            System.out.print(nextNode.data + " ");
            v = nextNode.data;
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

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        int[] visited = new int[V];
        breadthFirstSearch.bfs(graph, 0, visited);
    }
}
