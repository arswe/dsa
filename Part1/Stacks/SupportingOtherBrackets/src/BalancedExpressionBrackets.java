import java.util.Stack;

public class BalancedExpressionBrackets {
    public boolean isBalanced(String expression) {
        // Supporting Other Brackets
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '<' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            if (ch == ')' || ch == '>' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                var top = stack.pop();
                if (
                        (ch == ')' && top != '(') ||
                                (ch == '>' && top != '<') ||
                                (ch == ']' && top != '[') ||
                                (ch == '}' && top != '{')
                )
                    return false;
            }
        }
        return stack.isEmpty();
    }
}