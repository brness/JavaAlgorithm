package brness.pac2.selection;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args){
        int x=(int)(Math.random()*10);
        int y=(int)(Math.random()*10);

        System.out.println("What's the value of "+x+" + "+y+" ?");

        Scanner s=new Scanner(System.in);
        int z=s.nextInt();
        if(z==x+y){
            System.out.println(true);
        }
        else
            System.out.println(false);
    }
}
