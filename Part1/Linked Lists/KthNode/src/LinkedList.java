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

    // isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    // addFirst:
    public void addFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    // addLast:
    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // indexOf:
    public int indexOf(int value) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // contains:
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    // removeFirst:
    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node second = head.next;
            head.next = null;
            head = second;
        }
        size--;
    }

    // removeLast:
    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node previous = getPrevious(tail);
            tail = previous;
            tail.next = null;
        }
        size--;
    }

    // getPrevious:
    private Node getPrevious(Node node) {
        var current = head;

        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    // size:
    public int size() {
        return size;
    }

    // toArray:
    public int[] toArray() {
        int[] array = new int[size];
        var current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    // reverse:
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

    // getKthFromTheEnd:
    public int getKthFromTheEnd(int k) {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        var a = head;
        var b = head;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null) {
                throw new IllegalArgumentException();
            }
        }
        while (b != tail) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
}
