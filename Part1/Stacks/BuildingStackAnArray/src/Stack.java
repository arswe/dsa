import java.nio.channels.IllegalSelectorException;
import java.util.Arrays;

public class Stack {
    private final int[] items = new int[5];
    private int count;

    // push
    public void push(int item) {
        if (count == items.length)
            throw new StackOverflowError();
        items[count++] = item;
    }

    // pop
    public int pop() {
        if (count == 0)
            throw new IllegalSelectorException();
        return items[--count];
    }

    // peek
    public int peek() {
        if (count == 0)
            throw new IllegalSelectorException();
        return items[count - 1];
    }

    // isEmpty
    public boolean isEmpty() {
        return count == 0;
    }


    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
