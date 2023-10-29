public class Main {
    public static void main(String[] args) {
        // Priority Queue
        // Insert(5)
        // [1,3,4,5,2]
        // 0 1 2 3 4
        // items[i + 1] = items[i]

        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(2);
        queue.add(4);
        queue.add(1);
        queue.add(3);
        System.out.println(queue);

        var front = queue.remove();
        System.out.println("Front: " + front);

        while (!queue.isEmpty())
            System.out.println(queue.remove());

        System.out.println(queue);
    }
}