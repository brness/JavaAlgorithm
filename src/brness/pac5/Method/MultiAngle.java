package brness.pac5.Method;


import java.util.Scanner;

public class MultiAngle {
    public static void main(String[] args) {
        System.out.println("Enter the number of sides: ");
        Scanner s=new Scanner(System.in);
        int sides=s.nextInt();
        System.out.println("Enter the sides: ");
        double length=s.nextDouble();
        System.out.println("The area of the polygon is :"+area(sides,length));
    }

    public static double area(int x,double y){
        return x*y*y/(4*Math.tan(Math.PI/x));
    }
}
