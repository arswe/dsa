import java.math.MathContext;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    // Inserting a value into a binary search tree
    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;
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

    // Finding a value in a binary search tree
    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;
        }

        return false;
    }

    // Traversing a binary search tree (depth-first traversal)
    public void traversePreOrder() {
        traversePreOrder(root);
    }

    // Pre-order traversal (root, left, right)
    private void traversePreOrder(Node root) {
        if (root == null)
            return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    // In-order traversal (left, root, right)
    public void traverseInOrder() {
        traverseInOrder(root);
    }

    // In-order traversal (left, root, right)
    private void traverseInOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    // Post-order traversal (left, right, root)
    public void traversePostOrder() {
        traversePostOrder(root);
    }

    // Post-order traversal (left, right, root)
    private void traversePostOrder(Node root) {
        if (root == null)
            return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    // Calculating the size of a tree (number of nodes)
    public int height() {
        return height(root);
    }

    // Calculating the size of a tree (number of nodes)
    private int height(Node root) {

        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(
                height(root.leftChild),
                height(root.rightChild));
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    // Minimum Value in a Binary Search Tree - O(n)
    public int min() {
        if (root == null)
            throw new IllegalStateException("Tree is empty" + ", cannot find minimum");

        var current = root;
        var last = current;

        while (current.leftChild != null) {
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }

    //  Minimum Value in a Binary Search Tree - O(log n)
    private int min(Node root) {
        if (isLeaf(root))
            return root.value;

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    //  Equality Checking of Two Binary Trees - O(n)
    public boolean equals(Tree other) {
        if (other == null)
            return false;

        return equals(root, other.root); // private method
    }

    // Algorithm use: Depth-First Traversal (Pre-Order)
    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;

        if (first != null && second != null)
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        return false;
    }
}
