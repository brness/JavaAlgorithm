package brness.pac2.selection;

import java.util.Scanner;

public class ScissorRockPaper {
    public static void main(String[] args){
        System.out.println("Enter your choice:1-scissor 2-rock 3-paper");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();

        int y=(int)(Math.random()*3)+1;
        System.out.println("The computer is "+y);

        if(Math.abs(x-y)==2){
            System.out.println((x>y)?"you lost":"you win");
        }
        else if(Math.abs(x-y)==1)
            System.out.println((x>y)?"you win":"you lost");
        else
            System.out.println("It's a draw");
    }
}
