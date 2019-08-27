package brness.pac19.Recursive;

import java.util.Scanner;

public class Fibonacci {
    public static int time=0;
    public static void main(String[] args) {
        System.out.println("Enter a index for Fibonacci: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("The fibonacci number of "+n+" is :"+Fino(n));
        System.out.println("The times of the invoke is "+time);
    }

    public static int Fino(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else {
            time=time+2;
            return Fino(n-1)+Fino(n-2);
        }
    }
}
