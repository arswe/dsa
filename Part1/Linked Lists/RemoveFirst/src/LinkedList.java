public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    private boolean isEmpty() {
        return first == null;
    }

    // addLast
    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    // addFirst

    // indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    // Contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // removeFirst [10 -> 20 -> 30]

    public void removeFirst() {
        if (isEmpty())
            throw new IllegalStateException();

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
    }

}
