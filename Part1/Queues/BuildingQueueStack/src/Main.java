public class Main {
    public static void main(String[] args) {
        // Q [10,20,30]
        // S1 [10,20,30]
        // S2 [30,20,10]

        QueueWithTwoStack queue = new QueueWithTwoStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        var front = queue.dequeue();
        System.out.println(front);
    }
}