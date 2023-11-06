public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        Search search = new Search();

        var result = search.linearSearch(numbers, 7);
        System.out.println(result);
    }
}