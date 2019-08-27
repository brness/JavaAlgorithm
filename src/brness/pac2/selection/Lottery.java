package brness.pac2.selection;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args){
        System.out.println("Enter a number between 0 to 100: ");
        Scanner s=new Scanner(System.in);
        int number =s.nextInt();
        int n1=number%10;
        int n2=number/10;

        int x=(int)(Math.random()*100);
        System.out.println("The Lottery number is "+x);
        int x1=x%10;
        int x2=x/10;

        if(x1==n1&&x2==n2)
            System.out.println("Match two numbers : you win 10000");
        if((x1==n1||x1==n2)||(x2==n1||x2==n2))
            System.out.println("Match one numbers : you win 1000");
        if(x1==n2&&x2==n1)
            System.out.println("Match two numbers : you win 3000");
    }
}
