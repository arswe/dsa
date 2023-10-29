import java.util.Arrays;

public class PriorityQueue {
    private int[] items = new int[5];
    private int count;

    public void add(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        var i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    public int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i > 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i;
    }

    public int remove() {
        if (count == 0)
            throw new IllegalStateException();
        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }


    @Override
    public String toString() {
        return Arrays.toString(items);

    }
}
