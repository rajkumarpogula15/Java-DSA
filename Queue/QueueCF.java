import java.util.LinkedList;
import java.util.Queue;

public class QueueCF {
    public static void main(String[] args) {
        // Using LinkedList as Queue implementation
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements
        queue.add(10);     
        queue.offer(20);    
        queue.add(30);

        System.out.println("Queue: " + queue);

        // Removing elements
        System.out.println("Removed using poll(): " + queue.poll());    

        // Viewing head element
        System.out.println("Head using element(): " + queue.element()); 
        System.out.println("Head using peek(): " + queue.peek());      

        // Adding more elements
        queue.offer(40);
        queue.offer(50);

        System.out.println("Updated Queue: " + queue);

        // Queue size
        System.out.println("Queue size: " + queue.size());

        // Iterating through queue
        System.out.print("Iterating: ");
        for (Integer val : queue) {
            System.out.print(val + " ");
        }
    }
}
