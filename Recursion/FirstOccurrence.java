import java.util.Scanner;

public class FirstOccurrence {

    // Recursive method to find the first occurrence of key
    public static int firstOccurrence(int array[], int key, int i) {
        if (i == array.length) {
            return -1; // key not found
        }
        if (array[i] == key) {
            return i; // key found at index i
        }
        return firstOccurrence(array, key, i + 1); // recursive call
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        System.out.print("Array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a key to search its first occurrence: ");
        int key = sc.nextInt();

        int index = firstOccurrence(arr, key, 0);

        if (index >= 0) {
            System.out.println("Key found at index " + index);
        } else {
            System.out.println("Key not found");
        }

        sc.close();
    }
}
