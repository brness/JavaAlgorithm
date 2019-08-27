package brness.pac19.Recursive;

import java.util.Scanner;

public class Fibona {
    public static int time=0;
    public static void main(String[] args) {
        System.out.println("Enter the index of fibonacci:");
        Scanner s=new Scanner(System.in);
        int index=s.nextInt();
        long x=fibona(index);
        System.out.println("The fibonacci number of the is "+x);
    }

    public static long fibona(int x){
        long f0=0;
        long f1=1;
        long current=0;
        for(int i=1;i<x;i++){
            current=f0+f1;
            f0=f1;
            f1=current;
        }
        return current;
    }
}
