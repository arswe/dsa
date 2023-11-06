public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = search.linearSearch(arr, target);
        System.out.println(result);
    }
}