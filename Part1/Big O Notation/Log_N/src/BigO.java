public class BigO {
    public void log(int[] numbers) {
        // log n time complexity:

        // O(1) constant time complexity
        System.out.println(numbers[0]);

        // O(n) linear time complexity
        for (int number : numbers) {
            System.out.println(number);
        }

        // O(n^2) quadratic time complexity
        for (int first : numbers) {
            for (int second : numbers) {
                System.out.println(first + ", " + second);
            }
        }
    }
}
