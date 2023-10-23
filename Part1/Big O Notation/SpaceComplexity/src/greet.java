public class greet {
    public static void show() {
        // Space Complexity.

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        // O(1) space complexity:

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
            System.out.println("Hello World!");
        }

        // O(n) space complexity.

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Hello World!");
        }

        // O(n^2) space complexity:

        int[][] arr2 = new int[10][10];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Hello World!");
        }

        // O(n^3) space complexity:

        int[][][] arr3 = new int[10][10][10];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("Hello World!");
        }
    }
}
