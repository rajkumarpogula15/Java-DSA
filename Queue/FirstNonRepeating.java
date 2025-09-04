import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "aabccxbde";
        int[] freq = new int[256]; // for all ASCII characters
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch]++;

            // remove repeating chars from the front
            while (!q.isEmpty() && freq[q.peek()] > 1) {
                q.remove();
            }
        }

        // Final result
        if (q.isEmpty()) {
            System.out.println("No non-repeating character found");
        } else {
            System.out.println("First non-repeating character is: " + q.peek());
        }
    }
}
