package brness.pac7.MultiDimensionArray;

import java.util.Scanner;

public class RowSort {
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-3 matrix row by row");
        Scanner s=new Scanner(System.in);
        double[][] m=new double[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m[i][j]=s.nextDouble();
            }
        }

        sortRows(m);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }

    public static void sortRows(double[][] m){
        for(int i=0;i<m.length;i++){
            //选择排序  感觉现在用的全是选择排序
            for(int j=0;j<m[i].length;j++){
                double min=m[i][j];
                int p=j;
                for(int k=j;k<m[i].length;k++){
                    if(m[i][k]<min){
                        min=m[i][k];
                        p=k;
                    }
                }
                double temp=m[i][j];
                m[i][j]=m[i][p];
                m[i][p]=temp;
            }
        }
    }
}
