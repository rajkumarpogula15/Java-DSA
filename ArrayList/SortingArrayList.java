import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted List (Ascending): " + numbers);

        // Sort the ArrayList in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + numbers);
    }
}
