import java.util.LinkedList;
import java.util.Queue;
public class Interleave2halvesQueue {
    public static void interleaveQueue(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            throw new IllegalArgumentException("Queue must have an even number of elements");
        }

        int halfSize = q.size() / 2;
        Queue<Integer> firstHalf = new LinkedList<>();
        Queue<Integer> secondHalf = new LinkedList<>();

        // Dequeue the first half elements
        for (int i = 0; i < halfSize; i++) {
            firstHalf.add(q.poll());
        }

        // Dequeue the second half elements
        while (!q.isEmpty()) {
            secondHalf.add(q.poll());
        }

        // Interleave the two halves
        while (!firstHalf.isEmpty() && !secondHalf.isEmpty()) {
            q.add(firstHalf.poll());
            q.add(secondHalf.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }

        System.out.println("Original Queue: " + queue);
        interleaveQueue(queue);
        System.out.println("Interleaved Queue: " + queue);
    }
}
