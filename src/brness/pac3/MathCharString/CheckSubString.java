package brness.pac3.MathCharString;

import java.util.Scanner;

public class CheckSubString {
    public static void main(String[] args){
        System.out.println("Enter String s1: ");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Enter String s2: ");
        String s2=s.nextLine();
        if(s1.indexOf(s2)>0)
            System.out.println(s2+" is a subString of "+s1);
        else
            System.out.println(s2+" is not a subString of "+s1);
    }
}
