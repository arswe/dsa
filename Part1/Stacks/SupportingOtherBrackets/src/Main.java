import java.beans.Expression;

public class Main {
    public static void main(String[] args) {
        String str = ") 1 + 2 (";

        BalancedExpressionBrackets expression = new BalancedExpressionBrackets();
        var result = expression.isBalanced(str);
        System.out.println(result);
    }
}