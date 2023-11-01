public class Tree {
    private class Node {
        private final int value; // value is an integer
        private Node leftChild; // leftChild is a reference to another Node object
        private Node rightChild; // rightChild is a reference to another Node object

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;
    public void insert(int value) {
        var node = new Node(value); // create a new Node object

        if (root == null) {
            root = node; // create a new Node object and assign it to root
            return;
        }

        var current = root; // current is a reference to another Node object
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }
}
