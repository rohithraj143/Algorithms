package com.algorithms.practice1.graphs;

public class AdjacencyList {

    public Node head;

    public void add(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public boolean contains(int data) {
        if (head == null) {
            return false;
        }
        Node temp = this.head;

        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean delete(int data) {

        if (head == null) {
            return false;
        }

        if (head.data == data) {
            Node temp = head;
            head = null;
            head = temp.next;
            return true;
        }

        Node prev = null, curr = head;
        while (curr != null && curr.data != data) {
            prev = curr;
            curr = curr.next;
        }

        if(curr == null) {
            return false;
        }

        prev.next = curr.next;
        return true;
    }

    public void printAdjacencyList(Node node, int index) {
        System.out.print(index + " -> ");
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
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

        graph.deleteEdge(0, 1);
        graph.print();

        graph.deleteVertex(7);
        graph.print();
    }

}
