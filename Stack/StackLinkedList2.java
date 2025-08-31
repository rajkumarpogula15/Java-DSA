import java.util.LinkedList;

public class StackLinkedList2 {
    static class Stack{
        LinkedList<Object> list = new LinkedList<>(); // LinkedList to store stack elements
        // (object means any data type)
        // Push operation
        public void push(Object data) {
            list.addFirst(data);
        }

        // Pop operation
        public Object pop() {
            if (isEmpty()) {
                return null; // Stack is empty
            }
            return list.removeFirst();
        }

        // Peek operation
        public Object peek() {
            if (isEmpty()) {
                return null; // Stack is empty
            }
            return list.getFirst();
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return list.isEmpty();
        }

        // Get the size of the stack
        public int size() {
            return list.size();
        }

        // Show the stack elements as a stack one on top of the other
        public void display() {
            System.out.println("Stack elements (top to bottom):");
            for (Object item : list) {
                System.out.println(item);
            }
        }


        @Override//Override means to provide a specific implementation of a method 
        //that is already defined in a superclass or interface
        public String toString() {
            return list.toString();
        }

    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push("Hello");
        stack.push(4.5);
        System.out.println("Stack: " + stack);
        System.err.println("Stack elements");
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
