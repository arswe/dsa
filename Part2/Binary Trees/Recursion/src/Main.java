public class Main {
    public static void main(String[] args) {
        // 5! = 4 * 3!
        // n! = (n - 1) * (n - 2) * ... * 1

        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n == 1 ? 1 : n * factorial(n - 1); // Recursive call to factorial method with n - 1 as argument
    }
}