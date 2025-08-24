import java.util.ArrayList;

public class ReverseArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        // Print elements in reverse order
        System.out.print("Reversed List: [");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i));
            if (i != 0) System.out.print(", ");
        }
        System.out.println("]");
    }
}
