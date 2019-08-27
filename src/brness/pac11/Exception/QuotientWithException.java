package brness.pac11.Exception;

import java.util.Scanner;

public class QuotientWithException {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x=s.nextInt();
        int y=s.nextInt();

        try {
            int re=quotient(x,y);
            System.out.println("The quotient is "+re);
        }
        catch (ArithmeticException ex){
            System.out.println("Exception : an integer "+"can't be divided by zero");
        }
    }

    public static int quotient(int x,int y){
        if(y==0){
            throw new ArithmeticException("Divisor can't be zero");
        }
        return x/y;
    }
}
