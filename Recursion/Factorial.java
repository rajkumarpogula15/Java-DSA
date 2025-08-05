
import java.util.Scanner;

public class Factorial{

    public static int factorial(int n){
    if(n==0){
        return 1;
    }
    else{
        return n*factorial(n-1);
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int n=sc.nextInt();
        while(true){
            if(n>0){
            int f=factorial(n);
            System.out.println("Factorial is "+f);
            break;
            }
            else{
                System.out.print("Enter a positive number ");
                n=sc.nextInt();
            }
        }
    }
}