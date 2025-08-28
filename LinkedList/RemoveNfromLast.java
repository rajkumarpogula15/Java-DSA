public class RemoveNfromLast {
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
        public void addLast(int data) {
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

        // Print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Remove nth element from the last of the linked list
        public void removeN(int n) {
            if (head == null || n <= 0) return;

            Node first = head;
            Node second = head;

            // Move first pointer n steps ahead
            for (int i = 0; i < n; i++) {
                if (first == null) return; // n is greater than the length of the list
                first = first.next;
            }

            // If first is null, we need to remove the head
            if (first == null) {
                head = head.next;
                return;
            }

            // Move both pointers until first reaches the end
            while (first.next != null) {
                first = first.next;
                second = second.next;
            }

            // Remove the nth node from the end
            second.next = second.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println("Original List:");
        list.printList();
        int n=2;
        list.removeN(n);

        System.out.println("List After Removal of " + n + "th Element from End:");
        list.printList();
    }
}
