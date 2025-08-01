//print sub string from start to end of given index (included)

public class SubString {
    public static void subString(String str,int start,int end){
        String substr="";
        for(int i=start;i<=end;i++){
            substr=substr+str.charAt(i);
        }
        System.out.println("sub string from index "+start+" to "+end+" is "+substr);
    }
    public static void main(String[] args) {
        String str="Rajkumar Pogula";
        System.out.println("string "+str);
        subString(str,3,9);
    }
}
