package brness.pac10.Extends;

import java.util.ArrayList;
import java.util.Scanner;

public class AddTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=(int)(Math.random()*10);
        int y=(int)(Math.random()*10);
        System.out.println("What is "+x+"+"+y+"?");
        ArrayList<Integer> list=new ArrayList<>();
        int answer=s.nextInt();
        while(answer!=x+y){
            if(!list.contains(answer)){
                System.out.print("Wrong answer.Try again.");
                System.out.println("What is "+x+"+"+y+"?");
                list.add(answer);
            }
            else {
                System.out.println("You already enter " + answer);
                System.out.print("Wrong answer.Try again.");
                System.out.println("What is " + x + "+" + y + "?");
            }
            answer=s.nextInt();
        }
        System.out.println("You got it!");
    }
}
