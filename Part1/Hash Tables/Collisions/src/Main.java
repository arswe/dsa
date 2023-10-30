public class Main {
    public static void main(String[] args) {
        // Create two instances of the Collisions class
        var a = new Collisions(0, 0, 10, 10);
        var b = new Collisions(5, 5, 10, 10);

        // Check if the two instances are colliding
        if (a.isColliding(b)) {
            System.out.println("Collision!");
        } else {
            System.out.println("No collision!");
        }
    }
}