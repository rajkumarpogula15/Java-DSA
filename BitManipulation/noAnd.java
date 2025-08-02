//printing num1 & num2 and num1 | num2 without using & and | operator
//Binary to Decimal convertion
//Decimal to Binary convertion

import java.util.Scanner;

public class noAnd {
    public static int binary(int num){//Decimal to binary convertion
        int x=0,count=0;
        while(num>0){
            x+=(num%2)*((int)Math.pow(10, count));
            num=num/2;
            count++;
        }
        return x;
    }

    public static int decimal(int num){//Binary to Decimal convertion
        int x=0,count=0;
        while(num>0){
            x+=(num%10)*((int)Math.pow(2, count));
            num=num/10;
            count++;
        }
        return x;
    }

    public static int and(int x,int y) {//function to return x&y
        int and=0,zcount=0;
        while(x!=0 && y!=0){
            if(x%10==1 && y%10==1){
                and+=1*((int)Math.pow(10, zcount));
                zcount++;
                x=x/10;
                y=y/10;
            }
            else{
                zcount++;
                x=x/10;
                y=y/10;
            }
        }
        return and;
    }

    public static int or(int x,int y) {//function to return x|y
        int or=0,zcount=0;
        while(x!=0 && y!=0){
            if(x%10==1 || y%10==1){
                or+=1*((int)Math.pow(10, zcount));
                zcount++;
                x=x/10;
                y=y/10;
            }
            else{
                zcount++;
                x=x/10;
                y=y/10;
            }
        }
        return or;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2=sc.nextInt();
        int x=binary(num1);
        int y=binary(num2);
        System.out.println("num 1 and 2 in binary "+x+" and "+y);
        int or=or(x, y);
        int and=and(x, y);
        int orDecimal=decimal(or);
        int andDecimal=decimal(and);
        System.out.println("num1&num2 and num1|num2 in Binary "+and+" and "+or);
        System.out.println("\nnum1&num2 and num1|num2 in Decimal "+andDecimal+" and "+orDecimal);
    }
}
