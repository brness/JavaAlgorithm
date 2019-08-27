package brness.pac19.Recursive;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();

        int result=gcd(x,y);
        System.out.println("The gcd of "+x+","+y+" is "+result);
    }

    public static int gcd(int x,int y){
        if(x<y){
            int temp=x;
            x=y;
            y=temp;
        }
        while (x%y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        return y;
    }
}
