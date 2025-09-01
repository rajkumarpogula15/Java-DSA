import java.util.Stack;

public class StockSpanProblem {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indexes

        for (int i = 0; i < n; i++) {
            // Pop while current price is higher or equal
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            // If stack empty → all previous days are smaller
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current day index
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85, 10, 20, 10, 30, 80};
        int[] result = calculateSpan(prices);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
