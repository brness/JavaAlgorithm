package brness.pac1.basic;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        System.out.println("Enter a number between 0 and 1000: ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int sum=0;
        for(int i=0;i<3;i++){
            sum=sum+(int)(x/Math.pow(10,i))%10;
        }
        System.out.print(sum);
    }
}
