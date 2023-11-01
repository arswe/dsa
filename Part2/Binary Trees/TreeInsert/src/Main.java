public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7); // create a new Node object and assign it to root
        tree.insert(4); // create a new Node object and assign it to root.leftChild
        tree.insert(9); // create a new Node object and assign it to root.rightChild
        tree.insert(1); // create a new Node object and assign it to root.leftChild.leftChild
        tree.insert(6); // create a new Node object and assign it to root.leftChild.rightChild
        tree.insert(8); // create a new Node object and assign it to root.rightChild.leftChild
        tree.insert(10); // create a new Node object and assign it to root.rightChild.rightChild

        System.out.println("Done");
    }
}