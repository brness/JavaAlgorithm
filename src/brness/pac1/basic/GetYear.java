package brness.pac1.basic;

import java.util.Scanner;

public class GetYear {
    public static void main(String[] args){
        System.out.print("Enter the number of minutes: ");
        Scanner s=new Scanner(System.in);
        int min=s.nextInt();
        int days=min/(24*60);
        int day=days%365;

        int year=days/365;
        System.out.print(min+" minutes is approximately "+year+" years "+day+"days");
    }
}
