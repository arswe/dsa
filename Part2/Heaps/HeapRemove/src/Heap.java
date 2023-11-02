public class Heap {
    private int[] items = new int[10];
    private int size;

    // Insertion in a heap is O(log n)
    public void insert(int value) {
        if (isFull())
            throw new IllegalStateException();

        items[size++] = value;
        bubbleUp();
    }

    // Removal in a heap is O(log n)
    public int remove() {

        if (isEmpty())
            throw new IllegalStateException();

        items[0] = items[--size];

        var index = 0;
        while (index <= size && !isValidParent(index)) {
            var largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
        return 0;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private int largerChildIndex(int index) {
        return (leftChild(index) > rightChild(index)) ?
                leftChildIndex(index) : rightChildIndex(index);
    }

    private boolean isValidParent(int index) {
        return items[index] >= leftChild(index) &&
                items[index] >= rightChild(index);
    }

    // Left Child item: 2 * index + 1
    private int leftChild(int index) {
        return items[leftChildIndex(index)];
    }

    // Right Child item: 2 * index + 2
    private int rightChild(int index) {
        return items[rightChildIndex(index)];
    }

    // left child: 2 * index + 1
    private int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    // right child: 2 * index + 2
    private int rightChildIndex(int index) {
        return index * 2 + 2;
    }


    private boolean isFull() {
        return size == items.length;
    }

    private void bubbleUp() {
        var index = size - 1;
        while (index > 0 && items[index] > items[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int first, int second) {
        var temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }
}
