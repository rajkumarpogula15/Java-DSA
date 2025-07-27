
import java.util.Scanner;

public class ArrayArg {
    public static void PrintArray(int arr[]) {
        System.out.println("Printing array using PrintArray function:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    public static void main (String args[]){
        int numbers[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<10;i++){
            numbers[i]=sc.nextInt();
        }
        PrintArray(numbers);
        }
    }
    

