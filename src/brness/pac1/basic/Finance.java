package brness.pac1.basic;

import java.util.Scanner;

public class Finance {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        int x=s.nextInt();
        double sum=0;
        for(int i=0;i<6;i++){
            sum=(sum+x)*(1+0.00417);
        }
        System.out.print("After six month , the account value is $"+sum);
    }
}
