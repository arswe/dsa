import java.util.Stack;

public class BalancedExpressionBrackets {
    public boolean isBalanced(String expression) {
        // Supporting Other Brackets
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }
            if (isRightBracket(ch)) {
                if (stack.isEmpty()) return false;
                var top = stack.pop();
                if (BracketMatch(top, ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftBracket(char ch) {
        return ch == '(' || ch == '<' || ch == '[' || ch == '{';
    }

    private boolean isRightBracket(char ch) {
        return ch == ')' || ch == '>' || ch == ']' || ch == '}';
    }

    private boolean BracketMatch(char left, char right) {
        return (right == ')' && left != '(') ||
                (right == '>' && left != '<') ||
                (right == ']' && left != '[') ||
                (right == '}' && left != '{');
    }
}