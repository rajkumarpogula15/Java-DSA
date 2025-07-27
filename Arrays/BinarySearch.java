import java.util.*;

public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {1, 4, 2, 5, 6, 8, 9};
        int key = 6;
        // Sort the array 
        Arrays.sort(numbers);
        //in built function in java sort()
        int index = binarySearch(numbers, key);
        if (index != -1) {
            System.out.println("Key is found at index " + index);
        } else {
            System.out.println("Key not found");
        }
    }
}
