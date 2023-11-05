public class SelectionSort {
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = findMinIndex(array, i);
            swap(array, i, minIndex);
        }

    }

    private void swap(int[] array, int index, int minIndex) {
        int temp = array[index];
        array[index] = array[minIndex];
        array[minIndex] = temp;
    }

    private int findMinIndex(int[] array, int index) {
        int minIndex = index;
        for (int j = index; j < array.length; j++) {
            if (array[j] < array[minIndex]) minIndex = j;
        }
        return minIndex;
    }
}
