package brness.pac3.MathCharString;

import java.util.Scanner;

public class DtoH {
    public static void main(String[] args){
        System.out.println("Enter a decimal value(0 to 15):");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        if(x<10)
            System.out.println("The hex value is "+x);
        else
            System.out.println("The hex value is "+(char)(x+'A'-10));
    }
}
