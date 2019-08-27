package brness.pac3.MathCharString;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args){
        System.out.println("Enter an ASCII code: ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        System.out.println("The character for ASCII code "+x+" is "+(char)x);
    }
}
