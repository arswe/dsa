import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var sorter = new CountingSort();
        int[] numbers = {5, 3, 2, 6, 1, 4};
        sorter.sort(numbers, 6);
        System.out.println(Arrays.toString(numbers));
    }
}