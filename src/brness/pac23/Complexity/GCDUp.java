package brness.pac23.Complexity;

import java.util.Scanner;

public class GCDUp {
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
        int gcd=1;
        if(m%n==0)
            return n;
        for(int k=n/2;k>=1;k--){
            if(m%k==0&&n%k==0) {
                gcd = k;
                break;
            }
        }
        return gcd;
    }
}
