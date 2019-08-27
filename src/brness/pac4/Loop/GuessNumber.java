package brness.pac4.Loop;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.print("Guess a number between 0 to 100: ");
        int x=(int)(Math.random()*100);
        Scanner s=new Scanner(System.in);
        int g=s.nextInt();
        while(g!=x){
            if(g>x)
                System.out.println("Your guess is to high");
            else
                System.out.println("Your guess is to low");
            System.out.println("Enter your guess: ");
            g=s.nextInt();
        }
        System.out.println("Yes ,the number is "+ x+","+g);
    }
}
