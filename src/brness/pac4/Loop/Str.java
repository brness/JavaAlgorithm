package brness.pac4.Loop;

import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(int i=0;i<str.length();i=i+2){
            System.out.print(str.charAt(i));
        }
    }
}
