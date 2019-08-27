package brness.pac19.Recursive;

import java.util.Scanner;

public class RecursivePalidromeUsingSubstring {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner s=new Scanner(System.in);
        String p=s.nextLine();
        System.out.println(p+" is a Palidrome? "+isPalidrome(p));
    }

    public static boolean isPalidrome(String s){
        if (s.length()<=1)
            return true;
        else if (s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        else return isPalidrome(s.substring(1,s.length()-1));
    }
}
