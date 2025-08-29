// LinkedList implementation and operations using Java Collections Framework (LinkedList)
import java.util.LinkedList;

public class CollectionsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5); 

        // Printing elements
        System.out.println("Linked List: " + list);

        // Removing element at index 2 (removes 3)
        list.remove(2);
        System.out.println("After removal at index 2: " + list);

        // If you want to remove element '2' instead of index 2
        list.remove(Integer.valueOf(2));
        System.out.println("After removing element 2: " + list);

        // Accessing elements
        System.out.println("First element: " + list.get(0));
        System.out.println("Last element: " + list.getLast());

        // Getting the size of the list
        System.out.println("Size of the list: " + list.size());

        // check if list contains element
        System.out.println("List contains 3? " + list.contains(3));
        System.out.println("List contains 8? " + list.contains(8));

        // replace element at index 1
        list.set(1, 9);
        System.out.println("After replacing element at index 1: " + list);

        // Clearing the list
        list.clear();
        System.out.println("After clearing: " + list);

        // Checking if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());

        // Adding elements after clearing
        list.add(6);
        list.add(7);
        System.out.println("Linked List after re-adding elements: " + list);
    }
}
