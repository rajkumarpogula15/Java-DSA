
import java.util.Scanner;

public class PrincipalDiagonalSum{
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0 ; i<3 ; i++){
            for (int j = 0; j < 3; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i][i];
        }
        System.out.println("Principal Diagonal sum "+sum);

    }
}