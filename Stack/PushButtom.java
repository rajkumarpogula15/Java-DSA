import java.util.Stack;

public class PushButtom {
    public static Stack<Object> PushatButtom(Stack<Object> stack, Object data) {
        Stack<Object> tempStack = new Stack<>();
        // Move all elements from the original stack to the temporary stack
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        // Push the new data onto the original stack
        stack.push(data);
        // Move all elements back from the temporary stack to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return stack;
    }
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack after pushing 5 at the bottom: " + PushatButtom(stack, 5));
    }
}
