package brness.pac2.selection;

import java.util.Scanner;

public class TwoSquare {
    public static void main(String[] args){
        System.out.println("Enter the coordinates of the first square: ");
        Scanner s=new Scanner(System.in);
        double x1=s.nextDouble();
        double y1=s.nextDouble();
        System.out.println("Enter the Width and Height of the first square: ");
        double w1=s.nextDouble();
        double h1=s.nextDouble();
        System.out.println("Enter the coordinates of the second square: ");
        double x2=s.nextDouble();
        double y2=s.nextDouble();
        System.out.println("Enter the Width and Height of the second square: ");
        double w2=s.nextDouble();
        double h2=s.nextDouble();

        if(Math.abs(x1-x2)<=Math.abs((w1-w2)/2)&&Math.abs(y1-y2)<=Math.abs((h1-h2)/2))
            if(w1>w2)
                System.out.println("the second is inside the first");
            else
                System.out.println("the first is inside the second");
        else if(Math.abs(x1-x2)<=Math.abs((w1+w2)/2)&&Math.abs(y1-y2)<=Math.abs((h1+h2)/2))
            System.out.println("The first overlaps the second");
        else
            System.out.println("They don't overlap");
    }
}
