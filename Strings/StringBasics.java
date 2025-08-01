import java.util.*;
public class StringBasics {
    public static void main(String[] args) {
        String str = "RajKumar";                 
        String str2 = new String("Raju");        
        System.out.println(str);                  
        System.out.println(str2);   
        
        //string input
        Scanner sc=new Scanner(System.in);
        String str3=sc.next();
        System.out.println(str3);

        //length of string
        System.out.println("length of string "+str3.length());

        //Concatenation of strings
        String firstname="Pogula";
        String lastname="Rajkumar";
        String Fullname=firstname+" "+lastname;
        System.out.println(Fullname);

        //charAt 
        System.out.println(Fullname.charAt(0));

    }
}
