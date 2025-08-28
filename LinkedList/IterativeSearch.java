class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
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

    // Iterative search function
    public int IterativeSearch(Node head, int key) {
        Node current = head;
        int index = 0; // Initialize index to track position

        while (current != null) {
            if (current.data == key) {
                return index; // Key found
            }
            current = current.next;
            index++;
        }
        return -1; // Return -1 if key is not found in the list
    }
}

public class IterativeSearch {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        int key = 30;
        int index = list.IterativeSearch(list.head, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the list.");
        }
    }
}
