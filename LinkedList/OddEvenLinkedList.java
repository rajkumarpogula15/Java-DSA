class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class OddEvenLinkedList {

    // Function to rearrange the linked list
    public static Node rearrangeEvenOdd(Node head) {
        if (head == null) return null;

        Node evenStart = null, evenEnd = null;
        Node oddStart = null, oddEnd = null;
        Node current = head;

        while (current != null) {
            int val = current.data;

            if (val % 2 == 0) { // even
                if (evenStart == null) {
                    evenStart = current;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = current;
                    evenEnd = evenEnd.next;
                }
            } else { // odd
                if (oddStart == null) {
                    oddStart = current;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = current;
                    oddEnd = oddEnd.next;
                }
            }

            current = current.next;
        }

        // If there are no even numbers
        if (evenStart == null) return oddStart;

        // Combine even and odd lists
        evenEnd.next = oddStart;

        // If there are odd numbers, terminate the list properly
        if (oddEnd != null) {
            oddEnd.next = null;
        }

        return evenStart;
    }

    // Function to print linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print("->");
            current = current.next;
        }
        System.out.println("->NULL");
    }

    public static void main(String[] args) {
        // Sample Input: 8->12->10->5->4->1->6->NULL
        Node head = new Node(8);
        head.next = new Node(12);
        head.next.next = new Node(10);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(6);

        System.out.print("Original List: ");
        printList(head);

        head = rearrangeEvenOdd(head);

        System.out.print("Modified List: ");
        printList(head);
    }
}
