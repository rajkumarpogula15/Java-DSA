import java.util.Stack;

public class StackCollectionsFramework {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        System.err.println("Is stack empty? " + stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push("Hello");
        stack.push(4.5);
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
