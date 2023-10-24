public class Main {
    public static void main(String[] args) {
        IndexOfMethod numbers = new IndexOfMethod(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(3);
        System.out.println("Index of 200: " + numbers.indexOf(200));
        numbers.print();

    }
}