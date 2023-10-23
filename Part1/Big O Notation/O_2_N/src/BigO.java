public class BigO {
    public void log(int[] numbers) {
        // O(2^n) -> O(n) -> Linear Time

        // O(2^n) -> Exponential Time
        for (int i = 0; i < Math.pow(2, numbers.length); i++) {
            System.out.println(i);
        }
    }
}
