public class Search {
    public int ExponentialSearch(int[] arr, int target) {
        if (arr[0] == target) {
            return 0;
        }
        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i *= 2;
        }

        int left = i / 2;
        int right = Math.min(i, arr.length - 1);
        return BinarySearch(arr, left, right, target);
    }

    private int BinarySearch(int[] arr, int index, int min, int target) {
        if (min >= index) {
            int mid = index + (min - index) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return BinarySearch(arr, index, mid - 1, target);
            }
            return BinarySearch(arr, mid + 1, min, target);
        }
        return -1;
    }
}
