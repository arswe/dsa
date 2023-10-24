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
    private int size;

    // addLast method: O(1) - constant time
    public void addLast(int item) {
        var node = new Node(item);
        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    // addFirst method: O(1) - constant time
    public void addFirst(int item) {
        var node = new Node(item);
        if (first == null)
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    // indexOf method: O(n) - linear time
    public int indexOf(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    // contains method:
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // removeFirst method: O(1) - constant time
    public void removeFirst() {
        if (first == null)
            throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    // removeLast method: O(n) - linear time
    public void removeLast() {
        if (first == null)
            throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    // getPrevious method: O(n) - linear time
    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    // size method: O(1) - constant time
    public int size() {
        return size;
    }
}
