public class Main {
    public static void main(String[] args) {
        // Edge cases
        String str = "( ( ( ) ) )";
        System.out.println(str + " is balanced? " + new BalanceExpression().isBalanced(str));
        str = "( ( ( ) )";
        System.out.println(str + " is balanced? " + new BalanceExpression().isBalanced(str));
        str = "( ( ( ) ) ) )";

        // Normal cases
        str = "( ( ( ) ) )";
        System.out.println(str + " is balanced? " + new BalanceExpression().isBalanced(str));
        str = "( ( ( ) ) ) ( )";
        System.out.println(str + " is balanced? " + new BalanceExpression().isBalanced(str));

        // Invalid cases
        str = "( ( ( ) ) ) )";
        System.out.println(str + " is balanced? " + new BalanceExpression().isBalanced(str));
        str = "( ( ( ) ) ) ( ) )";
        System.out.println(str + " is balanced? " + new BalanceExpression().isBalanced(str));

    }
}