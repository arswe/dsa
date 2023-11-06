public class Search {
    public int TernarySearch(int[] arr, int target, int left, int right) {
        if (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;
            if (arr[mid1] == target) {
                return mid1;
            }
            if (arr[mid2] == target) {
                return mid2;
            }
            if (target < arr[mid1]) {
                return TernarySearch(arr, target, left, mid1 - 1);
            } else if (target > arr[mid2]) {
                return TernarySearch(arr, target, mid2 + 1, right);
            } else {
                return TernarySearch(arr, target, mid1 + 1, mid2 - 1);
            }
        }
        return -1;
    }
}
