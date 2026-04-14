
import java.util.Stack;
public class InfixConversion {

    // Function to return precedence
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Function to convert infix to postfix
    static String infixToPostfix(String exp) {
        String result = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If operand, add to output
            if (Character.isLetterOrDigit(c)) {
                result += c;
            }
            // If '(', push to stack
            else if (c == '(') {
                stack.push(c);
            }
            // If ')', pop until '('
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            }
            // Operator
            else {
                while (!stack.isEmpty() &&
                        precedence(c) <= precedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    // Function to convert infix to prefix
    static String infixToPrefix(String exp) {
        // Reverse infix
        StringBuilder input = new StringBuilder(exp);
        input.reverse();

        // Swap brackets
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(')
                input.setCharAt(i, ')');
            else if (input.charAt(i) == ')')
                input.setCharAt(i, '(');
        }

        // Convert to postfix
        String postfix = infixToPostfix(input.toString());

        // Reverse postfix to get prefix
        StringBuilder prefix = new StringBuilder(postfix);
        return prefix.reverse().toString();
    }

    public static void main(String[] args) {
        String infix = "A+(B*C-(D/E^F)*G)*H";

        System.out.println("Infix Expression  : " + infix);
        System.out.println("Postfix Expression: " + infixToPostfix(infix));
        System.out.println("Prefix Expression : " + infixToPrefix(infix));
    }
}
