import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8, 0, 2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);

        System.out.println("Sorted array:" + Arrays.toString(array));
    }
}