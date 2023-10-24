public class Main {
    public static void main(String[] args) {
        var insertMethod = new InsertMethod(5);
        insertMethod.insert(10);
        insertMethod.insert(20);
        insertMethod.insert(30);
        insertMethod.insert(40);

        insertMethod.print();
    }
}