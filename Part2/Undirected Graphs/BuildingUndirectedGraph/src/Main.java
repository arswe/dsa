public class Main {
    public static void main(String[] args) {
        System.out.println("Undirected Graphs!");

        var graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdge("A", "B", 3);
        graph.addEdge("B", "C", 2);
        graph.addEdge("A", "C", 1);

        graph.print();

    }
}