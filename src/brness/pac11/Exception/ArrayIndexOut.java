package brness.pac11.Exception;

import java.util.Scanner;

public class ArrayIndexOut {
    public static void main(String[] args) {
        int[] a=new int[100];
        for(int i=0;i<100;i++){
            a[i]=(int)(Math.random()*101);
        }
        System.out.println("Please enter the index of the array: ");
        Scanner s=new Scanner(System.in);
        int index=s.nextInt();
        try {
            int id=a[index];
            System.out.println("The number of the index is "+id);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }
    }
}
