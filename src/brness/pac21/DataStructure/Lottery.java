package brness.pac21.DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        System.out.println("Enter the lottery number:");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int g=num%10;
        int sh=num/10%10;
        int b=num/100;
        ArrayList<Integer> play=new ArrayList<>();
        play.add(g);
        play.add(sh);
        play.add(b);
        Collections.sort(play);
        int lott=(int)(Math.random()*1000);
        System.out.println("The lottery number is "+lott);
        g=lott%10;
        sh=lott/10%10;
        b=lott/100;
        ArrayList<Integer> real=new ArrayList<>();
        real.add(g);
        real.add(sh);
        real.add(b);
        Collections.sort(real);
        if(real==play)
            System.out.println("you win 10000");
        else if(real.equals(play))
            System.out.println("you win 3000");
        else if (real.containsAll(play.subList(0,2))||real.containsAll(play.subList(1,3)))
            System.out.println("you win 2000");
        else if(play.contains(g)||play.contains(sh)||play.contains(b))
            System.out.println("you win 1000");
        else System.out.println("you lose");
    }
}
