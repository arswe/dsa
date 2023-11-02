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

        var root = items[0];
        items[0] = items[--size];

        bubbleDown();
        return root;
    }

    // Check if the heap is empty
    private boolean isEmpty() {
        return size == 0;
    }

    // Check if the parent is greater than both children
    private int largerChildIndex(int index) {
        if (!hasLeftChild(index))
            return index;

        if (!hasRightChild(index))
            return leftChildIndex(index);

        return (leftChild(index) > rightChild(index)) ?
                leftChildIndex(index) : rightChildIndex(index);
    }

    // Check if the parent has a left child
    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) <= size;
    }

    // Check if the parent has a right child
    private boolean hasRightChild(int index) {
        return rightChildIndex(index) <= size;
    }

    // Check if the parent is greater than both children
    private boolean isValidParent(int index) {
        if (!hasLeftChild(index))
            return true;

        var isValid = items[index] >= leftChild(index);
        if (hasRightChild(index))
            isValid &= items[index] >= rightChild(index); // &= is a bitwise operator

        return isValid;
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


    // Check if the heap is full
    private boolean isFull() {
        return size == items.length;
    }

    // Bubble up the last item
    private void bubbleUp() {
        var index = size - 1;
        while (index > 0 && items[index] > items[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    // bubbleDown the first item
    private void bubbleDown() {
        var index = 0;
        while (index <= size && !isValidParent(index)) {
            var largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    // Get the parent index
    private int parent(int index) {
        return (index - 1) / 2;
    }

    // Swap two items
    private void swap(int first, int second) {
        var temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }
}
