public class Main {
    public static void main(String[] args) {
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "A");
        graph.print();

        graph.removeEdge("A", "B");
        graph.print();

        graph.removeNode("A");
        graph.print();
    }
}