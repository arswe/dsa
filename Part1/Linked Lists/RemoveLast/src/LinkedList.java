import java.util.NoSuchElementException;

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

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    // indexOf() is implemented here
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

    // contains() is implemented here
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // removeFirst() is implemented here
    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
    }

    // removeLast() is implemented here
    public void removeLast() {
        // [10 -> 20 -> 30]
        // previous = 10
        // last = 20

        if (isEmpty())
            throw new NoSuchElementException();

        var previous = getPrevious(last);
        last = previous;
        last.next = null;


    }

    private Object getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;

            current = current.next;
        }

        return null;
    }
}


