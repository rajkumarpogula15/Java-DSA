
import java.util.Scanner;

public class Gridways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.err.println("Enter the number of columns:");
        int m = sc.nextInt();
        int count = countWays(n, m);
        sc.close();
        System.out.println("Number of ways to reach the bottom-right corner: " + count);
    }

    public static int countWays(int n, int m) {
        if (n == 1 || m == 1) {
            return 1; // Only one way to reach the destination if in the first row or column
        }
        return countWays(n - 1, m) + countWays(n, m - 1); // Move down or right
    }
}
