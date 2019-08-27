package brness.pac1.basic;

import java.util.Scanner;

public class DriveFee {
    public static void main(String[] args){
        System.out.println("Enter the driving distance:");
        Scanner s=new Scanner(System.in);
        double distance=s.nextDouble();
        System.out.println("Enter miles per gallon:");
        double miles=s.nextDouble();
        System.out.println("Enter price per gallon: ");
        double price=s.nextDouble();

        double sum=distance/miles*price;
        System.out.println("The cost of driving is $"+sum);
    }
}
