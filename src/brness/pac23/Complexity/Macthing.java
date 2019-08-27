package brness.pac23.Complexity;

import java.util.Scanner;

public class Macthing {
    public static void main(String[] args) {
        System.out.println("Enter a String1: ");
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println("Enter a String2: ");
        String s2=s.nextLine();
        int k=0;
        for (int i=0;i<s1.length()-s2.length();i++){
            boolean isMatch=true;
            for (int j=0;j<s2.length();j++){
                if (s1.charAt(i+j)!=s2.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch){
                k=i;
                break;
            }
        }
        System.out.println("Matched at index "+k);
    }
}
