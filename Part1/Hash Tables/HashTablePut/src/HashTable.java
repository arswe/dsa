import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        // constructor
        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key); // get the index of the bucket
        if (entries[index] == null) // if the bucket is empty
            entries[index] = new LinkedList<>(); // create a new linked list

        var bucket = entries[index]; // bucket is a linked list
        for (var entry : bucket) {
            if (entry.key == key) { //
                entry.value = value; // update
                return; // return to the caller
            }
        }

        bucket.addLast(new Entry(key, value)); // add the new entry to the end of the linked list
    }

    private int hash(int key) {
        return key % entries.length; // hash function
    }
}
