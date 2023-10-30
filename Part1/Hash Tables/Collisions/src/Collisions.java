public class Collisions {
    // Collisions Program Example:

    int x, y;
    int width, height;

    // Constructor
    public Collisions(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // This method is called by the main method in Main.java
    public boolean isColliding(Collisions other) {
        return (this.x < other.x + other.width
                && this.x + this.width > other.x
                && this.y < other.y + other.height
                && this.y + this.height > other.y);
    }
}
