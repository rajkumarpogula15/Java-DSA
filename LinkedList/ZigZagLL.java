public class ZigZagLL {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked list class
    static class LinkedList {
        Node head;

        // Add element at the end
        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }

        // Print the list
        void printList() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }

        // Convert list to zigzag: 1->2->3->4->5 => 1->5->2->4->3
        void zigZag() {
            if (head == null || head.next == null) return;

            // Step 1: Find middle using slow/fast pointers
            Node slow = head, fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Step 2: Reverse second half
            Node second = reverse(slow.next);
            slow.next = null; // break the list into two halves

            // Step 3: Merge first half and reversed second half
            Node first = head;
            Node dummy = new Node(0);
            Node curr = dummy;

            while (first != null || second != null) {
                if (first != null) {
                    curr.next = first;
                    curr = curr.next;
                    first = first.next;
                }
                if (second != null) {
                    curr.next = second;
                    curr = curr.next;
                    second = second.next;
                }
            }

            head = dummy.next;
        }

        // Helper method to reverse a linked list
        private Node reverse(Node node) {
            Node prev = null;
            Node curr = node;
            while (curr != null) {
                Node nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println("Original Linked List:");
        list.printList();

        list.zigZag();

        System.out.println("ZigZag Linked List:");
        list.printList();
    }
}
