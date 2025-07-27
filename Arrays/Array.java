
import java.util.Scanner;

public class Array {
    
    public static void main (String args[]){
        int numbers[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<10;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Array is");
        for(int i=0;i<10;i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        }
    }
    

