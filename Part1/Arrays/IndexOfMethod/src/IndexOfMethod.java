public class IndexOfMethod {
    private int[] items;
    private int count;

    public IndexOfMethod(int length) {
        items = new int[length];
    }

    // Insert method run time complexity is O(1) but if we want to insert an item
    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }

    // RemoveAt method run time complexity is O(n) because we have to shift all the items
    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }

    // IndexOf method run time complexity is O(n) because we have to iterate over all the items
    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }


    // Print method
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
