package brness.pac23.Complexity;

import java.util.Scanner;

public class GCDEclid {
    public static void main(String[] args) {
        System.out.println("Enter the first parameter: ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        System.out.println("Enter the second parameter: ");
        int y=s.nextInt();
        int gcd=gcd(x,y);
        System.out.println("The Gcd of the two number is "+gcd);
    }
    public static int gcd(int m,int n){
        if (m<n){
            int temp=m;
            m=n;
            n=temp;
        }
        while (m%n!=0){
            int temp=m;
            m=n;
            n=temp%n;
        }
        return n;
    }
}
