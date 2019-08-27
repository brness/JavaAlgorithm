package brness.pac19.Recursive;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("Enter the n: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("The pow of "+n+" is :"+pow(n));
    }

    public static int pow(int n){
        if(n==0)
            return 1;
        else return 2*pow(n-1);
    }
}
