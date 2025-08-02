import java.util.*;

public class OperationsonBits {
    public static void getithbit(int a,int i) {// get ith bit
        int x=1<<i;
        System.out.println((a&x)>>i);
    }

    public static void Setithbit(int a,int i) {//set ith bit
        int x=1<<i;
        System.out.println((a|x)>>i);
    }

    public static void Clearithbit(int a,int i) {//Clear ith bit
        int x=~(1<<i);
        System.out.println((a&x)>>i);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int i=sc.nextInt();
        getithbit(x,i);
    }
}
