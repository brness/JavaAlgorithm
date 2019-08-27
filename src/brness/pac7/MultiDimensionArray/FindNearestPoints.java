package brness.pac7.MultiDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args) {
        System.out.println("Enter the number of points: ");
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int[][] a=new int[k][2];
        System.out.println("Enter "+k+" points: ");
        for (int i=0;i<k;i++){
            for(int j=0;j<2;j++)
                a[i][j]=s.nextInt();
        }
        int m=0,n=0;
        double min=100;
        for(int i=0;i<k;i++){
            for (int j=i+1;j<k;j++){
                if(distance(a[i][0],a[i][1],a[j][0],a[j][1])<min){
                    min=distance(a[i][0],a[i][1],a[j][0],a[j][1]);
                    m=i;
                    n=j;
                }
            }
        }
        System.out.println("The closed two points are "+ Arrays.toString(a[m])+","+Arrays.toString(a[n]));
    }

    public static double distance(int a1,int a2,int b1,int b2){
        return Math.sqrt(Math.pow((a1-b1),2)+Math.pow((a2-b2),2));
    }
}
