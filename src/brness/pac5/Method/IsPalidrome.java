package brness.pac5.Method;

import java.util.Scanner;

public class IsPalidrome {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        if(s1.equals(reverse(s1)))
            System.out.println(s1+" is a Palindrome");
        else
            System.out.println(s1+" is not a Palindrome");
    }

    public static String reverse(String s){
        String l="";
        for(int i=s.length()-1;i>=0;i--){
            l=l+s.charAt(i);
        }
        return l;
    }
}
