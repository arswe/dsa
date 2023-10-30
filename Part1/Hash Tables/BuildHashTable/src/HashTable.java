import org.w3c.dom.Entity;

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

    private LinkedList<Entity>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key);
        if (entries[index] == null) entries[index] = new LinkedList<>();

        var bucket = entries[index];
        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        var entry = new Entry(key, value);
        entries[index].addLast(entry);
    }

    private int hash(int key) {
        return key % entries.length;
    }

}
