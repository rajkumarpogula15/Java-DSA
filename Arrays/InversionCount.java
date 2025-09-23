public class InversionCount {
    // Function to count inversions using divide and conquer
    public static int countInversions(int[] arr) {
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }
    // Recursive merge sort function that returns inversion count
    private static int mergeSortAndCount(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            // Count inversions in left half
            count += mergeSortAndCount(arr, left, mid);
            // Count inversions in right half
            count += mergeSortAndCount(arr, mid + 1, right);
            // Count split inversions during merge
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }
    // Merge two sorted halves and count inversions
    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];
        // Copy data to temp arrays
        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < rightArr.length; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left, swaps = 0;

        // Merge the two halves
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                // All remaining elements in leftArr[i..end] form inversions
                swaps += (leftArr.length - i);
            }
        }
        // Copy remaining elements
        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }
        return swaps;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println("Number of inversions: " + countInversions(arr));
    }
}
