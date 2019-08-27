package brness.pac5.Method;

import java.util.Scanner;

public class SumUp {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner s= new Scanner(System.in);
        long x=s.nextLong();

        System.out.println("The sum of the number is "+sumDigits(x));
    }

    public static int sumDigits(long n){
        long sum=0;
        String s1=String.valueOf(n);
        for(int i=0;i<s1.length();i++){
            sum=sum+n/(int)Math.pow(10,i)%10;
        }
        return (int)sum;
    }
}
