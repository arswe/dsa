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

    // HashTable Put Method (Insert or Update)
    public void put(int key, String value) {
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }
        getOrCreateBucket(key).addLast(new Entry(key, value));
    }

    // HashTable Get Method (Retrieve)
    public String get(int key) {
        var entry = getEntry(key);
        return (entry == null) ? null : entry.value;
    }

    // HashTable Remove Method (Delete)
    public void remove(int key) {
        var entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException();
        getBucket(key).remove(entry);
    }

    // HashTable Get Bucket Method (Retrieve)
    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    // HashTable Get or Create Bucket Method (Retrieve or Create)
    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket == null)
            entries[index] = new LinkedList<>();
        return bucket;
    }

    // HashTable Get Entry Method (Retrieve)
    private Entry getEntry(int key) {
        var bucket = getBucket(key);
        if (bucket != null) {
            for (var entry : bucket)
                if (entry.key == key)
                    return entry;
        }
        return null;
    }

    // HashTable Hash Method (Hash)
    private int hash(int key) {
        return key % entries.length;
    }
}
