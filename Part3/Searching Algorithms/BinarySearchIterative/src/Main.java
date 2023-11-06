public class Main {
    public static void main(String[] args) {
        var search = new Search();
        var numbers = new int[]{1, 2, 3, 4, 5};
        var index = search.binarySearch(numbers, 2);
        System.out.println(index);
    }
}