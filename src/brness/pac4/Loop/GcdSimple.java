package brness.pac4.Loop;

import java.util.Scanner;

public class GcdSimple {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int x=s.nextInt();
        System.out.println("Enter second integer: ");
        int y=s.nextInt();
        int k=1;
        int gcd=1;
        while(k<=x&&k<=y){
            if(x%k==0&&y%k==0)
                gcd=k;
            k++;
        }
        System.out.println("The gcd of the two number is "+gcd);
    }
}
