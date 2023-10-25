public class Main {
    public static void main(String[] args) {
        // balance expression

        // 1. create an instance of BalanceExpression
        BalanceExpression balanceExpression = new BalanceExpression();

        // 2. call isBalanced method
        boolean isBalanced = balanceExpression.isBalanced("((()))");

        // 3. print the result
        System.out.println(isBalanced);

    }
}