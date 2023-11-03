public class Main {
    public static void main(String[] args) {
        // Insert: O(n) -> O(log n)
        // Remove: O(1) -> O(log n)
        // O(n) -> O(log n)

        var queue = new PriorityQueue();
        queue.add(30);
        queue.add(20);
        queue.add(10);
        queue.add(5);
        queue.add(1);

        System.out.println(queue);
    }
}