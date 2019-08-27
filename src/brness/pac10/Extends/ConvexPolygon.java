package brness.pac10.Extends;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvexPolygon {
    public static void main(String[] args) {
        System.out.println("Enter the number of the points: ");
        Scanner s=new Scanner(System.in);
        int length=s.nextInt();
        ArrayList<Double> x=new ArrayList<>();
        ArrayList<Double> y=new ArrayList<>();
        for(int i=0;i<length;i++){
            x.add(s.nextDouble());
            y.add(s.nextDouble());
        }

        double sum=0;
        for(int i=0;i<length-1;i++){
            sum=sum+(x.get(i)+x.get(i+1))*(y.get(i+1)-y.get(i));
        }

        System.out.println("The total area is "+Math.abs(sum)/2);
    }
}
