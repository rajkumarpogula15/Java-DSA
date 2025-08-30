public class CircularLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;
        Node tail;

        // Add element at the end
        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                tail.next = head; // point to itself to make it circular
                return;
            }
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // maintain circular nature
        }

        // Remove element from the end
        void remove() {
            if (head == null) return; // empty list
            if (head == tail) { // single element
                head = null;
                tail = null;
                return;
            }
            Node curr = head;
            while (curr.next != tail) {
                curr = curr.next;
            }
            curr.next = head; // maintain circular nature
            tail = curr;
        }

        // Remove element from the front
        void removeFromFront() {
            if (head == null) return; // empty list
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            head = head.next;
            tail.next = head; // maintain circular nature
        }

        //Contains element
        boolean contains(int data) {
            if (head == null) return false; // empty list
            Node curr = head;
            do {
                if (curr.data == data) return true;
                curr = curr.next;
            } while (curr != head);
            return false;
        }

        // Print the list
        void printList() {
            if (head == null) return; // empty list
            Node curr = head;
            do {
                System.out.print(curr.data + " ");
                curr = curr.next;
            } while (curr != head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList circularLL = new LinkedList();
        circularLL.add(1);
        circularLL.add(2);
        circularLL.add(3);
        circularLL.add(4);
        circularLL.add(5);
        System.err.println("Printing Circular Linked List After Addition of Elements:");
        circularLL.printList(); // 1 2 3 4 5


        circularLL.remove();
        System.err.println("Printing Circular Linked List After Removal of one Element from End:");
        circularLL.printList(); // 1 2 3 4

        circularLL.removeFromFront();
        System.err.println("Printing Circular Linked List After Removal of one Element from Front:");
        circularLL.printList(); // 2 3 4

        System.err.println("Contains 3? " + circularLL.contains(3)); // true
        System.err.println("Contains 6? " + circularLL.contains(6)); // false
    }
}
