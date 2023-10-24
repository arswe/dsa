public class Main {
    public static void main(String[] args) {
        RemoveMethod array = new RemoveMethod(10);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.removeAt(8);
        array.print();
    }
}