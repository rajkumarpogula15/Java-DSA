import java.util.*;
public class CountingSort {
    public static void countingSort(int arr[], int range) {
        int n = arr.length;
        int[] count = new int[range + 1];
        int[] output = new int[n];

        // Initialize count array
        for (int i = 0; i < range + 1; i++) {
            count[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Update the count array to contain the actual position of elements
        for (int i = 1; i <= range; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 10 integers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int range= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > range) {
                range = arr[i];
            }
        }
        countingSort(arr, range);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
