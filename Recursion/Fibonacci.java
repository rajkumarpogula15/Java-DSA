import java.util.*;  

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  //fibonacci(0) = 0
        } else if (n == 1) {
            return 1;  //fibonacci(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n;
        while (true) {
            System.out.print("Enter a non-negative number: ");
            n = sc.nextInt(); 

            if (n >= 0) {
                int f = fibonacci(n);
                System.out.println("Fibonacci number at position " + n + " is " + f);
                break;  // Exit the loop after valid input
            } else {
                System.out.println("Please enter a non-negative number.");
            }
        }

        sc.close();
    }
}
