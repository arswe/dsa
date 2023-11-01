public class Main {
    public static void main(String[] args) {
        var hashTable = new HashTable();
        hashTable.put(6, "A");
        hashTable.put(8, "B");
        hashTable.put(11, "C");
        hashTable.put(6, "A+");
        System.out.println(hashTable.get(10));
        System.out.println(hashTable.get(6));
        hashTable.remove(6);
        System.out.println(hashTable.get(6));
    }
}