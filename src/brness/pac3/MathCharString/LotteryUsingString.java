package brness.pac3.MathCharString;

import java.util.Scanner;

public class LotteryUsingString {
    public static void main(String[] args){
        String lottery=""+(int)(Math.random()*10)+(int)(Math.random()*10);

        System.out.println("Enter your number: ");
        Scanner s=new Scanner(System.in);
        String x=s.next();

        System.out.println("The lucky number is "+lottery);
        char x1=x.charAt(0);
        char x0=x.charAt(1);

        char l1=lottery.charAt(0);
        char l0=lottery.charAt(1);
        if(x1==l1&&x0==l0)
            System.out.println("you win 10000");
        else if(x1==l0&&x0==l1)
            System.out.println("you win 3000");
        else if(x1==l1||x1==l0||x0==l1||x0==l0)
            System.out.println("you win 1000");
        else
            System.out.println("you lose");
    }
}
