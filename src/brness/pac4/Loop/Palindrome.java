package brness.pac4.Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int i=0;
        int j=str.length()-1;
        int k=0;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) {
                k = 1;
                break;
            }
            i++;
            j--;
        }
        if(k==0)
            System.out.println(str+"is a Palindrome");
        else
            System.out.println(str+"is not a Palindrome");

    }
}
