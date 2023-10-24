public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();

        System.out.println("Size: " + list.size());

        list.addFirst(10);
        System.out.println("Size AddFirst: " + list.size());

        list.addLast(20);
        list.addLast(30);
        System.out.println("Size AddLast: " + list.size());

        list.removeFirst();
        System.out.println("Size RemoveFirst: " + list.size());

        list.removeLast();
        System.out.println("Size RemoveLast: " + list.size());

    }
}