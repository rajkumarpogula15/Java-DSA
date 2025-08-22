import java.util.Scanner;
public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the chessboard (N): ");
        int n = sc.nextInt(); // Size of the chessboard
        solveNQueens(n);
        sc.close();
    }

    public static void solveNQueens(int n) {
        char[][] board = new char[n][n];
        // Initialize the board with empty spaces
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        placeQueens(board, 0, n);
    }

    public static void placeQueens(char[][] board, int row, int n) {
        if (row == n) {
            printBoard(board);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q'; // Place queen
                placeQueens(board, row + 1, n); // Recur to place next queen
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }
        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            System.out.println(new String(row));
        }
        System.out.println();
    }
}