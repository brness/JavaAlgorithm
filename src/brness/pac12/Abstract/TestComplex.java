package brness.pac12.Abstract;

import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {
        System.out.println("Enter the first complex number");
        Scanner s=new Scanner(System.in);
        double x=s.nextDouble();
        double y=s.nextDouble();
        System.out.println("Enter the second complex number");
        double a=s.nextDouble();
        double b=s.nextDouble();
        Complex m=new Complex(x,y);
        Complex n=new Complex(a,b);
        System.out.println(m.toString()+" + "+n.toString()+" = "+m.add(n));
        System.out.println(m.toString()+" - "+n.toString()+" = "+m.substract(n));
        System.out.println(m.toString()+" * "+n.toString()+" = "+m.mutiply(n));
        System.out.println(m.toString()+" / "+n.toString()+" = "+m.divide(n));
        System.out.println("|"+m.toString()+"| = "+m.abs());
        int c=m.compareTo(n);
        if(c==1)
            System.out.println(m.toString()+" bigger");
        else if(c==-1)
            System.out.println(m.toString()+" smaller");
        else System.out.println(m.toString()+" equals");
    }
}
