public class Main {
    public static void main(String[] args) {
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");
        graph.addEdge("D", "E");

        graph.depthFirstTraversalRec("A");
        System.out.println();
        graph.depthFirstTraversalIter("A");
        System.out.println();
        graph.breadthFirstTraversal("A");
    }
}