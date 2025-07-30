import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;//to check if a swap occurred
        for (int i = 0; i < n - 1; i++) {
            swapped = false;//reset swapped for each outer loop iteration
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;//indicate that a swap occurred
                }
            }
            // If no two elements were swapped by inner loop, then break
            // since the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String args[]) {
        int numbers[] =new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        bubbleSort(numbers);
        System.out.println("Sorted array:");
        for (int i= 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
