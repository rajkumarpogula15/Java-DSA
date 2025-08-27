// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class MyLinkedList {
    Node head;

    // Add element at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // link new node to old head
        head = newNode;      // update head
    }

    // Add element at the end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) { // if list is empty
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) { // traverse till last node
            temp = temp.next;
        }
        temp.next = newNode; // attach at end
    }

    // Add element at a given index (0-based)
    public void addAt(int index, int data) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {  // same as addFirst
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int count = 0;

        // Traverse to node before the given index
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


public class AddFirstLastMiddle {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        list.printList(); // Output: 20 -> 10 -> 30 -> 40 -> null
    }
}
