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

    // Remove element from the end
    void remove() {
        if (tail == null) return;
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    // Remove element from the front
    void removeFromFront() {
        if (head == null) return;
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    // Remove element from the list
    void remove(int data) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == data) {
                if (curr == head) {
                    removeFromFront();
                } else if (curr == tail) {
                    remove();
                } else {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }
                return;
            }
            curr = curr.next;
        }
    }

    //is list contains element
    boolean contains(int data) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == data) return true;
            curr = curr.next;
        }
        return false;
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

public class DoubleLL {
    public static void main(String[] args) {
        MyDoublyLinkedList doubleLL = new MyDoublyLinkedList();
        doubleLL.add(1);
        doubleLL.add(2);
        doubleLL.add(3);
        doubleLL.add(4);
        doubleLL.add(5);
        doubleLL.add(6);
        doubleLL.add(7);

        doubleLL.printListForward();   // 1 2 3 4 5 6 7
        doubleLL.printListBackward();  // 7 6 5 4 3 2 1
        doubleLL.remove();
        doubleLL.removeFromFront();
        doubleLL.remove(4);
        doubleLL.printListForward();   // 1 2 3 5 6 7
        doubleLL.printListBackward();  // 7 6 5 3 2 1

        System.err.println("doubleLL.contains(3): " + doubleLL.contains(3));
        System.err.println("doubleLL.contains(8): " + doubleLL.contains(8));

    }
}
