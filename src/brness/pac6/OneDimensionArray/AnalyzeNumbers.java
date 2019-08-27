package brness.pac6.OneDimensionArray;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int size=s.nextInt();
        System.out.println("Enter the numbers: ");
        double[] l=new double[size];
        for(int i=0;i<size;i++){
            l[i]=s.nextDouble();
        }
        double ave=average(l);
        int k=0;
        System.out.println("Average is "+ave);
        for(int i=0;i<size;i++){
            if(l[i]>ave)
                k++;
        }
        System.out.println("Number of elements above the average is "+k);
    }

    public static double average(double[] n){
        double sum=0;
        for(int i=0;i<n.length;i++){
            sum=sum+n[i];
        }
        return sum/n.length;
    }
}
