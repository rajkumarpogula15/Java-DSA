import java.util.ArrayList;

public class StackArraylist {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        // Push operation
        public void push(int data) {
            list.add(data);
        }

        // Pop operation
        public int pop() {
            if (isEmpty()) {
                return -1; // Stack is empty
            }
            return list.remove(list.size() - 1);
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                return -1; // Stack is empty
            }
            return list.get(list.size() - 1);
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // Get the size of the stack
        public int size() {
            return list.size();
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }

}
