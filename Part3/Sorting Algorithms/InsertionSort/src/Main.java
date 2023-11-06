public class Main {
    public static void main(String[] args) {

        var sorter = new InsertionSort();
        int[] numbers = { 7, 3, 1, 4,6, 6, 2, 3 };

        sorter.sort(numbers);
        for (var number : numbers)
            System.out.println(number);
    }
}