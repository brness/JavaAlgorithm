package brness.pac8.Object;

import java.util.Scanner;

public class Locality {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns in the array: ");
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int column=s.nextInt();
        double[][] m=new double[row][column];
        System.out.println("Enter the array ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                m[i][j]=s.nextDouble();
            }
        }
        Location largest=locateLargest(m);
        System.out.println("The location of the largest element is "+
                largest.maxValue+" at "+"("+largest.row+","+largest.column+")");
    }

    public static Location locateLargest(double[][] m){
        Location l=new Location();
        double max=m[0][0];
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(max<m[i][j]){
                    max=m[i][j];
                    l.row=i;
                    l.column=j;
                }
            }
        }
        l.maxValue=max;
        return l;
    }
}

class Location{
    public int row;
    public int column;
    public double maxValue;
}
