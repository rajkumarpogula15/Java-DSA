//paranthasis vaildation
public class ParanthasisValidation {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println("{[()]} is a valid expression: " + isValid(str));
        str = "{[(])}";
        System.out.println("{[(])} is a valid expression: " + isValid(str));
        str = "{ab(c)d}";
        System.out.println("{ab(c)d} is a valid expression: " + isValid(str));
    }

    static boolean isValid(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
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
}