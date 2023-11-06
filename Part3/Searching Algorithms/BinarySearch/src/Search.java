public class Search {
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right)
            return -1;

        var middle = (left + right) / 2;

        if (target == arr[middle])
            return middle;

        if (target < arr[middle])
            return binarySearch(arr, target, left, middle - 1);


        return binarySearch(arr, target, middle + 1, right);
    }
}