package brness.pac5.Method;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        displayPattern(n);
    }

    public static void displayPattern(int x){
        for(int i=0;i<x;i++){
            for(int j=x-1;j>i;j--){
                System.out.print("\t");
            }
            for(int k=i+1;k>0;k--){
                System.out.print(k+"\t");
            }
            System.out.println();
        }
    }
}
