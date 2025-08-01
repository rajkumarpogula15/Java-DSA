
import java.util.Scanner;

public class Palindrome{
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Boolean x=isPalindrome(str);
        if(x){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}