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

    // AddLast method:
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

    // AddFirst method:
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

    // IndexOf method:
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

    // Contains method:
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // RemoveFirst method:
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

    // RemoveLast method:
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

    // GetPrevious method:
    private Node getPrevious(Node node) {
        var current = head;

        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    // Size method:
    public int size() {
        return size;
    }

    // ToArray method:
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

}
