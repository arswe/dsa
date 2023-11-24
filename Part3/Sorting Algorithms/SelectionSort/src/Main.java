public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);

        for (int i : arr)
            System.out.println(i);
        System.out.println("System works! ");


    }
}