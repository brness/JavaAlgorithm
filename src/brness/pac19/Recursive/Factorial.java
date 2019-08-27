package brness.pac19.Recursive;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        System.out.println("The factorial of "+n+" is "+fact(n));
    }

    public static BigInteger fact(int n){
        if (n==0)
            return BigInteger.ONE;
        else return fact(n-1).multiply(BigInteger.valueOf(n));
    }
}
