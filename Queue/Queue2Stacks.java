import java.util.*;
public class Queue2Stacks {
    static class Queue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;

        public Queue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void add(int value) {
            stack1.push(value);
        }

        public int remove() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            if (stack2.isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return stack2.pop();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }

        public int size() {
            return stack1.size() + stack2.size();
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.remove()); // Outputs 1
        System.out.println(queue.remove()); // Outputs 2
        queue.add(4);
        System.out.println(queue.remove()); // Outputs 3
        System.out.println(queue.remove()); // Outputs 4
    }
}