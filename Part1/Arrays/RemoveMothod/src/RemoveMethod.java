public class RemoveMethod {
    private int[] items;
    private int count;

    public RemoveMethod(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
//            System.arraycopy(items, 0, newItems, 0, count);
            System.arraycopy(items, 0, newItems, 0, count);

            items = newItems;

        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }


    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
