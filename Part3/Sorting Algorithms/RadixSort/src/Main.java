public class Main {
    public static void main(String[] args) {
        int[] array = {4725, 4586, 1330, 8792, 1594, 5729};
        RadixSort radixSort = new RadixSort();
        radixSort.sort(array, 10, 4);
        for (int j : array) {
            System.out.println(j);
        }
    }
}