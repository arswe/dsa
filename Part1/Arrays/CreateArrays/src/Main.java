import java.sql.Array;

public class Main {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));

        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);

        numbers.removeAt(1);
        numbers.print();
        System.out.println(numbers.indexOf(30));



    }
}