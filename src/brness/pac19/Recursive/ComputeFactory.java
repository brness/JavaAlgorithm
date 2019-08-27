package brness.pac19.Recursive;

import java.util.Scanner;

public class ComputeFactory {
    public static void main(String[] args) {
        System.out.println("Enter the n:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("The Factory of "+n+" is :"+factory(n));
    }
    public static int factory(int n){
        if(n==1)
            return 1;
        else return n*factory(n-1);
    }
}
