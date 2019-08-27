package brness.pac11.Exception;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x=s.nextInt();
        int y=s.nextInt();

        System.out.println("The Quotient is "+x/y);
    }
}
