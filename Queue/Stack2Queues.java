import java.util.LinkedList;
import java.util.Queue;

public class Stack2Queues {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Push element onto stack
        public void push(int x) {
            // Always enqueue to q1
            q1.add(x);
        }

        // Pop element from stack
        public int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            // Move elements from q1 to q2 except last
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            // Last element is the "top" of the stack
            int top = q1.remove();

            // Swap q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        // Peek the top element
        public int peek() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            int top = q1.peek();
            q2.add(q1.remove());

            // Swap queues back
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());  // 30
        System.out.println(stack.peek()); // 20
        System.out.println(stack.pop());  // 20
        System.out.println(stack.pop());  // 10
        System.out.println(stack.pop());  // Stack is empty
    }
}
