package brness.pac19.Recursive;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the integer: ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();

        reverseDisplay(x);
    }

    public static void reverseDisplay(int x){
        if (x!=0){
            System.out.print(x%10);
            reverseDisplay(x/10);

        }
    }
}
