public class CycleinLL {
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList {
        Node head;

        // Add element at the end of the list
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Create a cycle for testing
        public void createCycle(int pos) {
            if (pos == 0) return;
            Node cycleNode = null;
            Node current = head;
            int count = 1;
            while (current.next != null) {
                if (count == pos) {
                    cycleNode = current;
                }
                current = current.next;
                count++;
            }
            if (cycleNode != null) {
                current.next = cycleNode;
            }
        }

        // Detect cycle using Floyd's Tortoise and Hare algorithm
        public boolean detectCycle() {
            if (head == null) return false;
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) return true; // Cycle detected
            }
            return false; // No cycle
        }
    }
    public static void main(String[] args) {
        System.out.println("Detecting cycle in Linked List");
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.createCycle(2);
        System.out.println("Cycle detected: " + list.detectCycle());

    }
}
