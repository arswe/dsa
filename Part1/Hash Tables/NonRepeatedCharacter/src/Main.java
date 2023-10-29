public class Main {
    public static void main(String[] args) {
        var finder = new CharFinder();
        var result = finder.findFirstNonRepeatingChar("A green Apple");

        System.out.println(result);
    }
}