package brness.pac19.Recursive;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1=s.nextLine();
        reverseDisplay(s1);
    }

    public static void reverseDisplay(String s) {
        if (s.length() != 0) {
            System.out.print(s.charAt(s.length() - 1));
            reverseDisplay(s.substring(0, s.length() - 1));
        }
    }
}
