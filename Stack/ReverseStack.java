import java.util.*;

public class ReverseStack {

    // Function to insert element at the bottom of the stack
    public static void insertAtBottom(Stack<Object> stk, Object item) {
        if (stk.isEmpty()) {
            stk.push(item);
        } else {
            Object top = stk.pop();
            insertAtBottom(stk, item);
            stk.push(top);
        }
    }

    // Function to reverse the stack
    public static Stack<Object> stackReverse(Stack<Object> stk) {
        if (stk.isEmpty()) {
            return stk;
        }
        Object top = stk.pop();
        stackReverse(stk);
        insertAtBottom(stk, top); 
        return stk;
    }

    public static void main(String args[]) {
        Stack<Object> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        System.out.println("Original Stack: " + stk);

        stk = stackReverse(stk);

        System.out.println("Reversed Stack: " + stk);
    }
}
