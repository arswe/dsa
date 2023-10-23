public class BigO {
    public void log(int[] numbers) {
        // O(n)
        for (int number : numbers) {
            System.out.println(number);
        }

        // O(n^2)
        for (int first : numbers) {
            for (int second : numbers) {
                System.out.println(first + ", " + second);
            }
        }

        // O(n^3)
        for (int first : numbers) {
            for (int second : numbers) {
                for (int third : numbers) {
                    System.out.println(first + ", " + second + ", " + third);
                }
            }
        }
    }
}
