public class CountingSort {
    public void sort(int[] array, int max) {
        int[] counts = new int[max + 1];
        for (int item : array) {
            counts[item]++;
        }
        var k = 0;
        for (int i = 1; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                array[k++] = i;
            }
        }
    }

}
