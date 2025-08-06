//pairing friends problem a person can be paired or can be single both cases possible
//input number of friends
//output number of possible ways of pairing
import java.util.Scanner;

public class pairingFriends {
    public static int pairingfriends(int n){
        if(n==1|| n==0){
            return 1;
        }
        if(n==2){
            return 2;
        }

        //single
        int function1=pairingfriends(n-1);

        //paired
        int function2=pairingfriends(n-2);
        int pairways=(n-1)*function2;

        return function1+pairways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of friends ");
        int n=sc.nextInt();
        while (true) { 
            if(n<0){
                System.out.print("Enter number (non-negative integer) of friends ");
                n=sc.nextInt();
            }
            else{
                int ways=pairingfriends(n);
                System.out.print("Number of ways of pairing is "+ways);
                break;
            }
        }
        sc.close();  
    }
}
