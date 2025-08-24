import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // add(E e) → Add elements at the end
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("After adding: " + numbers); // [10, 20, 30]

        // add(int index, E e) → Insert at a specific position
        numbers.add(1, 15);  
        System.out.println("After inserting at index 1: " + numbers); // [10, 15, 20, 30]

        // get(int index) → Get element at index
        System.out.println("Element at index 2: " + numbers.get(2)); // 20

        // set(int index, E e) → Replace element
        numbers.set(2, 25);  
        System.out.println("After setting index 2 to 25: " + numbers); // [10, 15, 25, 30]

        // remove(int index) → Remove by index
        numbers.remove(1);  
        System.out.println("After removing index 1: " + numbers); // [10, 25, 30]

        // remove(Object o) → Remove by value (first occurrence)
        numbers.remove(Integer.valueOf(25));  
        System.out.println("After removing value 25: " + numbers); // [10, 30]

        // size() → Get number of elements
        System.out.println("Size of ArrayList: " + numbers.size()); // 2

        // contains(Object o) → Check if element exists
        System.out.println("Contains 30? " + numbers.contains(30)); // true
        System.out.println("Contains 50? " + numbers.contains(50)); // false

        // isEmpty() → Check if list is empty
        System.out.println("Is empty? " + numbers.isEmpty()); // false

        // clear() → Remove all elements
        numbers.clear();
        System.out.println("After clear: " + numbers); // []
        System.out.println("Is empty now? " + numbers.isEmpty()); // true
    }
}
