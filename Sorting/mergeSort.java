public class mergeSort {

    public static void merge(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            // Recursively divide
            merge(arr, start, mid);
            merge(arr, mid + 1, end);

            // Merge sorted halves
            sort(arr, start, mid, end);
        }
    }

    public static void sort(int arr[], int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = start;
        int b[] = new int[arr.length];

        // Merge the two halves into b[]
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                b[k++] = arr[i++];
            } else {
                b[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            b[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= end) {
            b[k++] = arr[j++];
        }

        // Copy sorted data back to original array
        for (int m = start; m <= end; m++) {
            arr[m] = b[m];
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 7, 2, 7};

        System.out.print("Original array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        merge(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
