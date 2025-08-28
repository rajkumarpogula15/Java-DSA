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

    // Recursive search function
    public int RecursiveSearch(Node head, int key) {
        return searchHelper(head, key, 0);
    }

    // Helper function to keep track of index
    private int searchHelper(Node current, int key, int index) {
        if (current == null) {
            return -1; // Key not found
        }
        if (current.data == key) {
            return index; // Key found
        }
        return searchHelper(current.next, key, index + 1); // Move to next node
    }
}

public class RecursiveSearch {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        int key = 40;
        int index = list.RecursiveSearch(list.head, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the list.");
        }
    }
}
