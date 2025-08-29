public class RemoveCycleLL {
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

        // Detect cycle using Floyd’s Tortoise and Hare
        public boolean hasCycle() {
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true; // Cycle found
                }
            }
            return false;
        }

        // Remove cycle using Floyd's Tortoise and Hare algorithm
        public boolean removeCycle() {
            if (head == null) return false;
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    // Cycle detected
                    Node entry = head;
                    while (entry != slow) {
                        entry = entry.next;
                        slow = slow.next;
                    }
                    // Find the last node in the cycle
                    while (fast.next != slow) {
                        fast = fast.next;
                    }
                    fast.next = null; // Break the cycle
                    return true;
                }
            }
            return false; // No cycle
        }

        // Print the linked list (safe after cycle removal)
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
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

        // Create cycle at position 2 (node with value 2)
        list.createCycle(2);
        
        System.out.println("Cycle detected: " + list.hasCycle());
        System.out.println("Removing cycle: " + list.removeCycle());
        System.out.print("Linked list after removal: ");
        list.printList();
    }
}
