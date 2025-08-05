import java.util.Scanner;

public class TailingProblem {
    public static int tailingproblem(int n){
        if(n==0||n==1){
            return 1;
        }

        //vertical
        int fun1=tailingproblem(n-1);

        //horizantal
        int fun2=tailingproblem(n-2);

        int totalways=fun1+fun2;
        return totalways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value in 2Xn floor ");
        int n=sc.nextInt();
        while (true) {
            if (n >= 0) {
                int w=tailingproblem(n);
                System.out.println("Number of ways "+w);
                break;  // Exit the loop after valid input
            } else {
                System.out.println("Please enter a non-negative number.");
                n=sc.nextInt();
            }
        } 
        sc.close(); 
    }
}
