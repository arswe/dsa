import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    private boolean isEmpty() {
        return head == null;
    }

    // AddLast: O(1)
    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // AddFirst: O(1)
    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    // IndexOf: O(n)
    public int indexOf(int item) {
        int index = 0;
        var current = head;

        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    // Contains: O(n)
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // RemoveFirst: O(1)
    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (head == tail)
            head = tail = null;
        else {
            var second = head.next;
            head.next = null;
            head = second;
        }
        size--;
    }

    // RemoveLast: O(n)
    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (head == tail)
            head = tail = null;
        else {
            var previous = getPrevious(tail);
            tail = previous;
            tail.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        var current = head;

        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    // Size: O(1)
    public int size() {
        return size;
    }

    // ToArray: O(n)
    public int[] toArray() {
        int[] array = new int[size];
        var current = head;
        var index = 0;

        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    // Reverse: O(n)
    public void reverse() {
        if (isEmpty()) return;

        var previous = head;
        var current = head.next;

        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        tail = head;
        tail.next = null;
        head = previous;
    }
}
