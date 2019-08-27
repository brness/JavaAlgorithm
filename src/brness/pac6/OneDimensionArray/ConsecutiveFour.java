package brness.pac6.OneDimensionArray;

import java.util.Scanner;

public class ConsecutiveFour {
    public static void main(String[] args) {
        System.out.println("Enter the number of values: ");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        System.out.println("Enter the values: ");
        double[] x=new double[size];
        for(int i=0;i<size;i++){
            x[i]=s.nextDouble();
        }
        if(isConsecutiveFour(x))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list doesn't have consecutive fours");
    }

    public static boolean isConsecutiveFour(double[] list){
        for(int i=0;i<list.length-3;i++){
            if(list[i]==list[i+1]&&list[i]==list[i+2]&&list[i]==list[i+3])
                return true;
        }
        return false;
    }
}
