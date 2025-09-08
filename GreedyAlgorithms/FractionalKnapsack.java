import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;
        int n = weights.length;

        // Step 1: Store items as {weight, value, ratio}
        double[][] items = new double[n][3];
        for (int i = 0; i < n; i++) {
            items[i][0] = weights[i];
            items[i][1] = values[i];
            items[i][2] = (double) values[i] / weights[i]; // ratio
        }

        // Step 2: Sort items by ratio in descending order
        Arrays.sort(items, new Comparator<double[]>() {
            public int compare(double[] a, double[] b) {
                return Double.compare(b[2], a[2]); // descending
            }
        });

        // Step 3: Greedy selection
        double totalValue = 0.0;
        for (int i = 0; i < n; i++) {
            if (capacity <= 0) break;

            if (items[i][0] <= capacity) {
                // take whole item
                capacity -= items[i][0];
                totalValue += items[i][1];
            } else {
                // take fraction
                totalValue += items[i][2] * capacity;
                capacity = 0;
            }
        }

        System.out.println("Maximum value in Knapsack: " + totalValue);
    }
}
