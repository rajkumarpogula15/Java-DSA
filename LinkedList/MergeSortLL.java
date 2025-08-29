// Merge Sort implementation for Linked List in Java
import java.util.LinkedList;

public class MergeSortLL {
    public static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        LinkedList<Integer> left = new LinkedList<>(list.subList(0, mid));
        LinkedList<Integer> right = new LinkedList<>(list.subList(mid, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right) {
        LinkedList<Integer> merged = new LinkedList<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.peekFirst() < right.peekFirst()) {
                merged.add(left.pollFirst());  // take and remove first element
            } else {
                merged.add(right.pollFirst());
            }
        }

        // Append remaining elements
        merged.addAll(left);
        merged.addAll(right);

        return merged;
    }

 
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(4);

        System.out.println("Original Linked List: " + list);
        list = mergeSort(list);
        System.out.println("Sorted Linked List: " + list);
    }
}
