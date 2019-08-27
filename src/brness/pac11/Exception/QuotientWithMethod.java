package brness.pac11.Exception;

import java.util.Scanner;

public class QuotientWithMethod {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x=s.nextInt();
        int y=s.nextInt();
        int result=quotient(x,y);
        System.out.println("The Quotient is "+result);
    }

    public static int quotient(int x,int y){
        if(y==0){
            System.out.println("The divisor can't be zero");
            System.exit(1);
        }
        return x/y;
    }
}
