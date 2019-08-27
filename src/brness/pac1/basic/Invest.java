package brness.pac1.basic;

import java.util.Scanner;

public class Invest {
    public static void main(String[] args){
        System.out.println("Enter investment amount: ");
        Scanner s=new Scanner(System.in);
        double amount=s.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double rate =s.nextDouble();
        System.out.println("Enter number of years: ");
        int years=s.nextInt();

        double sum=amount*Math.pow((1+rate/1200),years*12);
        System.out.println("Accumulated value is "+sum);
    }
}
