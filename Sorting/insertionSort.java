public class InsertionSort {
    public static void main(String[] args) {
        int numbers[] = {5, 4, 3, 8, 12, 7};
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i]; // Current element to insert
            int j = i - 1;// Initialize j to point to the last index of the sorted portion
            // Shift elements greater than temp to the right
            while (j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            // Place temp in its correct position
            numbers[j + 1] = temp;
        }
        // Print the sorted array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
