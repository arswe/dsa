public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        var front = queue.dequeue();
        System.out.println(front);
        System.out.println(queue);

    }
}