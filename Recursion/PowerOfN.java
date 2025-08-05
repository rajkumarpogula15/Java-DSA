import java.util.Scanner;

public class PowerOfN {
    public static double power(int n,int pow){
        if(pow==0){
            return 1;
        }
        if(pow<0){
            return (1.0/n)*power(n,pow+1);
        }
        return n*power(n,pow-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number ");
        int n=sc.nextInt();
        System.out.print("Enter power ");
        int p=sc.nextInt();
        double np=power(n,p);
        System.out.print("Value is "+np);
        sc.close();                                         
    }
    
}
