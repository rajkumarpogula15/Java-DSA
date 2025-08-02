
import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int number=sc.nextInt();
        OddEven(number);
    }

    public static void OddEven(int n) {
    if((n&1)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
    
}
