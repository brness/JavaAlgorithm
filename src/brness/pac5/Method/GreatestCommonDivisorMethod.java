package brness.pac5.Method;


import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        System.out.print("Enter the two number:");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int k=gcd(x,y);
        System.out.print("The gcd of the two number is "+k);
    }

    public static int gcd(int x,int y){
        int k=1;
        int gcd=1;
        while(k<=x&&k<=y){
            if(x%k==0&&y%k==0){
                gcd=k;
            }
            k++;
        }
        return gcd;
    }
}
