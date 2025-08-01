

public class CompareString {
    public static void main(String[] args) {
        String str1="Rajkumar";
        String str2="Rajkumar";
        String str3=new String("Rajkumar");

        System.out.println("String 1 "+str1+"\n String 2 "+str2+"\n String 3 "+str3+"\n");
        System.out.println("Using s1=s2 \n ");

        if(str1==str2){
            System.out.println("String 1 and 2 are equal");

        }
        else{
            System.out.println("String 1 and 2 are not equal");
        }

        if(str1==str3){
            System.out.println("String 1 and 3 are equal");

        }
        else{
            System.out.println("String 1 and 3 are not equal");
        }


        //USE s1.equals(s3)
        System.out.println("Using s1.equals(s3) \n");
        if(str1.equals(str3)){
            System.out.println("String 1 and 3 are equal");

        }
        else{
            System.out.println("String 1 and 3 are not equal");
        }
    }
    
}
