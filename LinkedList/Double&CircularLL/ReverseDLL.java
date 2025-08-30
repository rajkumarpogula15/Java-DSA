package Double&CircularLL;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}   

class MyDoublyLinkedList {
    Node head;
    Node tail;

    // Add element at the end
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Reverse the doubly linked list
    void reverse() {
        Node curr = head;
        Node temp = null;
        while (curr != null) {
            // Swap next and prev
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            // Move to next node (which is previous before swap)
            curr = curr.prev;
        }
        // Adjust head and tail
        if (temp != null) {
            head = temp.prev; // temp is now at the old head's previous node
            tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
        }
    }

    // Print the list forward
    void printListForward() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Print the list backward
    void printListBackward() {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }
}
public class ReverseDLL {
    public static void main(String[] args) {
        MyDoublyLinkedList doubleLL = new MyDoublyLinkedList();
        doubleLL.add(1);
        doubleLL.add(2);
        doubleLL.add(3);
        doubleLL.add(4);
        doubleLL.add(5);
        doubleLL.add(6);
        doubleLL.add(7);
        System.err.println("Before reversing the Doubly Linked List:");
        System.err.println("Print Forward: ");
        doubleLL.printListForward();   // 1 2 3 4 5 6 7
        System.err.println("Print Backward: ");
        doubleLL.printListBackward();  // 7 6 5 4 3 2 1

        doubleLL.reverse();
        System.err.println("After reversing the Doubly Linked List:");
        System.err.println("Print Forward: ");
        doubleLL.printListForward();   // 7 6 5 4 3 2 1
        System.err.println("Print Backward: ");
        doubleLL.printListBackward();  // 1 2 3 4 5 6 7
    }
}
