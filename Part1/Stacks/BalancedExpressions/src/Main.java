public class Main {
    public static void main(String[] args) {
        // balance expression
        String expression = "(1 + 2)";

        BalanceExpression balanceExpression = new BalanceExpression();
        var result = balanceExpression.isBalanced(expression);
        System.out.println(result);
    }
}