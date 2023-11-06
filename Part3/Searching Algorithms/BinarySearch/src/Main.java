public class Main {
    public static void main(String[] args) {
        var binarySearch = new Search();
        var arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        var result = binarySearch.binarySearch(arr, 1);
        System.out.println(result);
    }
}