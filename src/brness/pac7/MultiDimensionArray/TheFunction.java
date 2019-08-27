package brness.pac7.MultiDimensionArray;

import brness.pac5.Method.SimpleCalendar;

import java.util.Arrays;
import java.util.Scanner;

public class TheFunction {
    public static void main(String[] args) {
        System.out.println("Enter a matrix: ");
        Scanner s=new Scanner(System.in);
        double[][] a=new double[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=s.nextDouble();
            }
        }
        System.out.println("enter b matrix");
        double[] b=new double[2];
        for(int i=0;i<2;i++){
            b[i]=s.nextDouble();
        }
        double[] answer=new double[2];
        answer=linearEquation(a,b);
        if(answer==null)
            System.out.println("no answer for the equation");
        else
            System.out.println(Arrays.toString(answer));
    }

    public static double[] linearEquation(double[][] a,double[] b){
        if(a[0][0]*a[1][1]-a[0][1]*a[1][0]==0)
            return null;
        double[] reply=new double[a.length];
        reply[0]=(b[0]*a[0][0]-b[1]*a[0][1])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]);
        reply[1]=(b[1]*a[0][0]-b[0]*a[1][0])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]);
        return reply;
    }
}
