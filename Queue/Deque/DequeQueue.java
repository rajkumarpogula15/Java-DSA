import java.util.*;

public class DequeQueue {
    static class QueueUsingDeque {
        Deque<Integer> deque = new LinkedList<>();

        public void enqueue(int value) {
            deque.addLast(value);
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return deque.removeFirst();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public int size() {
            return deque.size();
        }
    }

    public static void main(String[] args) {
        QueueUsingDeque queue = new QueueUsingDeque();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Dequeued element: " + queue.dequeue()); // 1
        System.out.println("Queue size: " + queue.size()); // 2
        System.out.println("Is queue empty? " + queue.isEmpty()); // false
    }
}
