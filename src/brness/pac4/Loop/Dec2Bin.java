package brness.pac4.Loop;

import java.util.Scanner;

public class Dec2Bin {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        System.out.println("The binary form of "+x+" is "+Integer.toBinaryString(x));
        System.out.println("The Octal form of "+x+" is "+Integer.toOctalString(x));
    }
}
