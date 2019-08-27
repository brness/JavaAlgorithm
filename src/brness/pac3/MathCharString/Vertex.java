package brness.pac3.MathCharString;

import java.util.Scanner;

public class Vertex {
    public static void main(String[] args){
        System.out.println("Enter the radius of the bounding circle");
        Scanner s=new Scanner(System.in);
        double radius=s.nextDouble();
        System.out.println("The coordinate of five points are: ");
        for(int i=0;i<5;i++){
            System.out.println("("+radius*Math.cos(Math.PI/10+Math.toRadians(72*i))+","+radius*Math.sin(Math.PI/10+Math.toRadians(72*i))+")");
        }
    }
}
