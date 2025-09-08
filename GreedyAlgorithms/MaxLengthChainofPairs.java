import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainofPairs {
    public static void main(String[] args) {
        int[] first = {5, 1, 3, 7, 2, 8};
        int[] second = {24, 2, 4, 8, 3, 9};
        int n = first.length;

        // Step 1: Store pairs in 2D array
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = first[i];
            pairs[i][1] = second[i];
        }

        // Step 2: Sort pairs by second element using Arrays.sort + Comparator
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));

        // Step 3: Greedy selection of pairs
        int count = 1; // first pair always selected
        int lastIncludedIndex = 0;

        System.out.println("Selected Pairs in Maximum Length Chain:");
        System.out.println("(" + pairs[lastIncludedIndex][0] + ", " + pairs[lastIncludedIndex][1] + ")");

        for (int i = 1; i < n; i++) {
            if (pairs[i][0] > pairs[lastIncludedIndex][1]) {
                count++;
                lastIncludedIndex = i;
                System.out.println("(" + pairs[i][0] + ", " + pairs[i][1] + ")");
            }
        }

        System.out.println("\nMaximum length of chain of pairs: " + count);
    }
}
