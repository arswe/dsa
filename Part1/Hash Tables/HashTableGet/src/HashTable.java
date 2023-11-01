import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key);
        if (entries[index] == null) // if entries[index] is null
            entries[index] = new LinkedList<Entry>();

        var bucket = entries[index];
        for (var entry : bucket) { // for each entry in bucket
            if (entry.key == key) { // if entry.key is equal to key
                entry.value = value; // entry.value is equal to value
                return; // return
            }
        }

        bucket.addLast(new Entry(key, value));
    }

    public String get(int key) {
        var index = hash(key); // index is the hash of key
        var bucket = entries[index]; // bucket is a linked list
        if (bucket != null) { // if bucket is not null
            for (var entry : bucket) // for each entry in bucket
                if (entry.key == key) // if entry.key is equal to key
                    return entry.value; // return entry.value
        }
        return null; // return null
    }

    private int hash(int key) {
        return key % entries.length;
    }

}
