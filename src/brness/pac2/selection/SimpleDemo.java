package brness.pac2.selection;

import java.util.Scanner;

public class SimpleDemo {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x=s.nextInt();

        if(x%5==0){
            System.out.println("HiFive");
        }
        if(x%2==0){
            System.out.println("HiTwo");
        }
    }
}
