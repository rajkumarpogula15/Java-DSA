import java.util.*;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            deque.addLast(i);
        }

        System.out.println("Original Deque: " + deque);
        deque.addFirst(0);
        deque.addLast(6);
        System.out.println("After adding elements: " + deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removing elements: " + deque);
        System.out.println("First Element: " + deque.getFirst());
        System.out.println("Last Element: " + deque.getLast());
    }
}
