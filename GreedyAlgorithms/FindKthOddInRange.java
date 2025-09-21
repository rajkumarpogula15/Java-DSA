public class FindKthOddInRange {
    // Find the K-th odd number in the range [L, R]
    public static int findKthOddInRange(int[] range, int k) {
        if (k <= 0) return 0;

        int L = range[0];
        int R = range[1];

        // Count how many odd numbers are in [L, R]
        int count;
        if ((R & 1) == 1) {  // R is odd
            count = (R - L + 2) / 2; // ceil division
            if (k > count) return 0;
            return R - 2 * (k - 1);
        } else {  // R is even
            count = (R - L + 1) / 2;
            if (k > count) return 0;
            return R - 2 * k + 1;
        }
    }

    public static void main(String[] args) {
        int[] range = { -10, 10 };
        int k = 8;
        System.out.println(findKthOddInRange(range, k));
    }
}
