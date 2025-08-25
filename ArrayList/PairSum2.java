import java.util.ArrayList;
// Two Pointer Approach
// Finding any pair in sorted and rotated arrayList has targeted sum
public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int targetSum = 16;
        boolean result = hasPairWithSum(list, targetSum);
        System.out.println("Pair with sum " + targetSum + " exists: " + result); // Output: true
    }

    public static boolean hasPairWithSum(ArrayList<Integer> list, int targetSum) {
        int n = list.size();
        int pivot = -1;

        // Step 1: Find the pivot (where rotation happens)
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        // If not rotated, pivot stays at last element
        if (pivot == -1) pivot = n - 1;

        // Step 2: Set two pointers
        int left = (pivot + 1) % n; // smallest element
        int right = pivot;          // largest element

        // Step 3: Search for pair
        while (left != right) {
            int currentSum = list.get(left) + list.get(right);

            if (currentSum == targetSum) {
                return true;
            }

            if (currentSum < targetSum) {
                left = (left + 1) % n;  // move forward circularly
            } else {
                right = (n + right - 1) % n; // move backward circularly
            }
        }

        return false;
    }
}
