public class Main {
    public static void main(String[] args) {
        var search = new Search();
        var arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        var target = 0;
        var result = search.JumpSearch(arr, target);
        System.out.println(result);
    }
}