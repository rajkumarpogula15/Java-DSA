import java.util.Stack;

public class DupilicateParanthasis {

    //Checks if the expression has balanced parentheses
    static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isMatching(top, ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    static boolean isMatching(char open, char close) {
        return (open == '{' && close == '}') ||
               (open == '(' && close == ')') ||
               (open == '[' && close == ']');
    }

    //Checks for duplicate parentheses
    public static boolean hasDupilicate(String str) {
        if (!isValid(str)) return false; // invalid expressions can't have "valid" duplicates

        Stack<Character> stk = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                int count = 0;
                while (!stk.isEmpty() && stk.peek() != '(') {
                    stk.pop();
                    count++;
                }
                if (!stk.isEmpty()) {
                    stk.pop(); // remove the matching '('
                }
                if (count < 1) {
                    // means there was nothing between "()"
                    return true;
                }
            } else {
                stk.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String exp1 = "(a(b((c+d))))";
        System.out.println("Expression " + exp1 + " has Duplicate values: " + hasDupilicate(exp1));

        String exp2 = "((a+b))"; // has duplicate parentheses
        System.out.println("Expression " + exp2 + " has Duplicate values: " + hasDupilicate(exp2));

        String exp3 = "(a+b)"; // no duplicates
        System.out.println("Expression " + exp3 + " has Duplicate values: " + hasDupilicate(exp3));
    }
}
