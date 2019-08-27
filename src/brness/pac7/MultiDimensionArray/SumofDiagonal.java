package brness.pac7.MultiDimensionArray;

import java.util.Scanner;

public class SumofDiagonal {
    public static void main(String[] args) {
        System.out.println("Enter a 4-by-4 matrix row by row");
        Scanner s=new Scanner(System.in);
        double[][] a=new double[4][4];
        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                a[i][j]=s.nextDouble();
            }
        }
        double sum=0;
        for(int i=0;i<4;i++)
            sum=sum+a[i][i];
        System.out.println("Sum of elements in the major diagonal is "+sum);
    }
}
