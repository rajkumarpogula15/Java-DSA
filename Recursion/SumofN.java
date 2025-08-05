import java.util.Scanner;

public class SumofN {
    public static int sum(int n){
        if(n>0){
            return n+sum(n-1);
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int n=sc.nextInt();
        
        while(true){if(n>0){
            int sum=sum(n);  
            System.out.println("Sum of n natural numbers is "+sum);
            break;
        }
        else{
            System.out.print("Enter a positive number ");
            n=sc.nextInt();
        }
    }
    }
}
