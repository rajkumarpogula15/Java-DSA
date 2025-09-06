import java.util.*;

public class DequeStack {
    static class StackUsingDeque {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int value) {
            deque.addLast(value);
        }

        public int pop() {
            if (isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
            return deque.removeLast();
        }

        public int top() {
            if (isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
            return deque.getLast();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public int size() {
            return deque.size();
        }
    }
    public static void main(String[] args) {
        StackUsingDeque stack = new StackUsingDeque();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element: " + stack.top()); // 3
        System.out.println("Stack size: " + stack.size()); // 3
        System.out.println("Popped element: " + stack.pop()); // 3
        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
