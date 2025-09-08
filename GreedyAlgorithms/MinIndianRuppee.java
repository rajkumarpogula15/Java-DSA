public class MinIndianRuppee {
    public static void main(String[] args) {
        int amount = 93;
        int[] denominations = {1, 2, 5, 10, 20, 50, 100, 200, 500};

        // Step 1: Sort denominations in descending order (already sorted here)
        // Step 2: Greedy selection of denominations
        int count = 0;
        System.out.println("Denominations used:");
        for (int i = denominations.length - 1; i >= 0; i--) {
            while (amount >= denominations[i]) {
                amount -= denominations[i];
                count++;
                System.out.print(denominations[i] + " ");
            }
        }

        System.out.println("\nTotal number of notes/coins used: " + count);
    }
}
