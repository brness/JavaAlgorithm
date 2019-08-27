package brness.pac19.Recursive;

import java.util.Scanner;

public class RecursivePalidrome {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner s=new Scanner(System.in);
        String p=s.nextLine();
        System.out.println(p+" is a Palidrome? "+isPalidrome(p,0,p.length()-1));
    }

    public static boolean isPalidrome(String s,int high,int low){
        if(high>=low)
            return true;
        else if (s.charAt(high)!=s.charAt(low))
            return false;
        else return isPalidrome(s,high+1,low-1);
    }
}
