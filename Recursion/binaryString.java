import java.util.Scanner;

public class binaryString {

    // Recursive function to generate all binary strings of length `n`
    // where no two 1's are together
    public static void binarystring(int n, String str, char x) {
        // Base case: if length becomes 0, print the current string
        if (n == 0) {
            System.out.println(str);
            return;
        }
        
        // Always add '0' and recurse (you can always place 0)
        binarystring(n - 1, str + '0', '0');

        // Only add '1' if the previous character is not '1'
        if (x != '1') {
            binarystring(n - 1, str + '1', '1');
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter length of binary string:");
        int n = sc.nextInt(); 
        while(true){
            if(n>0){
                System.out.println("Binary strings of length n and no two 1's together are");
            binarystring(n, "", '0');
            break;
            }
            else{
                System.out.print("Enter a positive number as length ");
                n=sc.nextInt();
            }
        }
        sc.close();
    }
}