import java.util.Stack;

public class BalancedExpressionBrackets {
    public boolean isBalanced(String expression) {
        // Supporting Other Brackets
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            }
            if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}