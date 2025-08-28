public class Palindrome {
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

        // check given list is palindrome are not
        public boolean isPalindrome() {
            if (head == null || head.next == null) return true;

            // Find middle using slow and fast pointers
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse second half
            Node prev = null, current = slow;
            while (current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            // Compare first and second half
            Node firstHalf = head, secondHalf = prev;
            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) return false;
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }
            return true;
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
        boolean isPalindrome = list.isPalindrome();
        System.out.println("Is the list a palindrome? " + isPalindrome);
    }
}
