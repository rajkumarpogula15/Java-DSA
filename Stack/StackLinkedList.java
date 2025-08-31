package Stack;

public class StackLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node top;
        int size;

        Stack() {
            this.top = null;
            this.size = 0;
        }

        // Push operation
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
            size++;
        }

        // Pop operation
        public int pop() {
            if (isEmpty()) {
                return -1; // Stack is empty
            }
            int poppedData = top.data;
            top = top.next;
            size--;
            return poppedData;
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                return -1; // Stack is empty
            }
            return top.data;
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return size == 0;
        }

        // Get the size of the stack
        public int size() {
            return size;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node current = top;
            while (current != null) {
                sb.append(current.data).append(" ");
                current = current.next;
            }
            return sb.toString().trim();
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
