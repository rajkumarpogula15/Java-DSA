
// Singly Linked List with Deletion
class LinkedList {
    
    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete node by value
    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If head itself holds the key
        if (head.data == key) {
            head = head.next;
            System.out.println("Deleted: " + key);
            return;
        }

        Node current = head;
        Node prev = null;

        // Search for the key
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If key not found
        if (current == null) {
            System.out.println("Element not found: " + key);
            return;
        }

        // Unlink node
        prev.next = current.next;
        System.out.println("Deleted: " + key);
    }

    // Display the linked list
    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();

        list.delete(20);  // delete middle node
        list.display();

        list.delete(10);  // delete head
        list.display();

        list.delete(50);  // delete non-existing
        list.display();
    }
}