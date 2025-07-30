public class Butterfly {
    public static void main(String[] args) {
        int n = 5; // You can change this value for a larger butterfly
        for (int i = 1; i <= n; i++) {
            // Print left side of the butterfly
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j <=(n - i); j++) {
                System.out.print("  ");
            }
            // Print right side of the butterfly
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // Print left side of the butterfly
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j <=(n - i); j++) {
                System.out.print("  ");
            }
            // Print right side of the butterfly
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
