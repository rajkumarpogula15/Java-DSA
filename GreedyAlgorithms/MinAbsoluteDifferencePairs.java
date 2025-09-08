import java.util.Arrays;

public class MinAbsoluteDifferencePairs {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40};

        // Print original arrays
        System.out.println("Original Array 1: " + Arrays.toString(arr1));
        System.out.println("Original Array 2: " + Arrays.toString(arr2));

        // Step 1: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 2: Pair elements greedily and calculate total difference
        int totalDiff = 0;
        System.out.println("\nPairs with Minimum Absolute Difference:");
        for (int i = 0; i < arr1.length; i++) {
            int diff = Math.abs(arr1[i] - arr2[i]);
            totalDiff += diff;
            System.out.println("(" + arr1[i] + ", " + arr2[i] + ") -> diff = " + diff);
        }

        // Step 3: Print total sum of absolute differences
        System.out.println("\nTotal Minimum Sum of Absolute Differences: " + totalDiff);
    }
}
