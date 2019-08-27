package brness.pac3.MathCharString;

import java.util.Scanner;

public class MaxCircle {
    public static void main(String[] args){
        System.out.println("Enter the point one: ");
        Scanner s=new Scanner(System.in);
        double x1=s.nextDouble();
        double y1=s.nextDouble();

        System.out.println("Enter the second point: ");
        double x2=s.nextDouble();
        double y2=s.nextDouble();

        double radius=6371.01;
        double d=radius*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));

        System.out.println("The distance of the two points is "+d);
    }
}
