import java.util.LinkedList;

public class QueueUsingLL {
    static class Queue<T> {
        private LinkedList<T> list = new LinkedList<>();

        // Check if queue is empty
        public boolean isEmpty() {
            return list.isEmpty();
        }

        // Enqueue (add element to the rear)
        public void enqueue(T data) {
            list.addLast(data);
        }

        // Dequeue (remove element from the front)
        public T dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return null;
            }
            return list.removeFirst();
        }

        // Peek (get the front element without removing)
        public T peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return null;
            }
            return list.getFirst();
        }

        // Size of the queue
        public int size() {
            return list.size();
        }

        // Print queue elements
        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (T item : list) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Queue elements:");
        q.printQueue(); // Output: 1 2 3

        System.out.println("Removed: " + q.dequeue()); // Output: Removed: 1
        q.printQueue(); // Output: 2 3

        System.out.println("Front element: " + q.peek()); // Output: Front element: 2
        System.out.println("Queue size: " + q.size());    // Output: Queue size: 2

        q.dequeue();
        q.dequeue();
        q.dequeue(); // Extra dequeue -> "Queue is empty"
    }
}
