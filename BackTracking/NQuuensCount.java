
import java.util.Scanner;

public class NQuuensCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the chessboard (N): ");
        int n = sc.nextInt();// Size of the chessboard
        sc.close();
        int count = countNQueens(n);
        System.out.println("Number of solutions for " + n + " queens: " + count);
    }

    public static int countNQueens(int n) {
        int[] count = {0};// Use an array to hold the count since Java passes by value
        boolean[] cols = new boolean[n];// Track occupied columns
        boolean[] diag1 = new boolean[2 * n];// Track occupied left diagonals
        boolean[] diag2 = new boolean[2 * n];// Track occupied right diagonals
        placeQueens(0, n, cols, diag1, diag2, count);// Start placing queens from the first row
        return count[0];// Return the total count of valid arrangements
    }

    public static void placeQueens(int row, int n, boolean[] cols, boolean[] diag1, boolean[] diag2, int[] count) {
        if (row == n) {
            count[0]++;// Found a valid arrangement of queens
            return;
        }
        for (int col = 0; col < n; col++) {// Try placing queen in each column
            if (!cols[col] && !diag1[row + col] && !diag2[row - col + n]) {
                cols[col] = diag1[row + col] = diag2[row - col + n] = true;// Place queen
                placeQueens(row + 1, n, cols, diag1, diag2, count);// Recur to place next queen
                cols[col] = diag1[row + col] = diag2[row - col + n] = false;// Backtrack
            }
        }
    }
    }
