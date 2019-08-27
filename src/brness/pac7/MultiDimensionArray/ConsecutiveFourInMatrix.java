package brness.pac7.MultiDimensionArray;

import java.util.Scanner;

public class ConsecutiveFourInMatrix {
    public static void main(String[] args) {
        System.out.println("Enter the row of the matrix: ");
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        System.out.println("Enter the column of the matrix: ");
        int column=s.nextInt();
        int[][] x=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                x[i][j]=s.nextInt();
            }
        }
        if(isConsecutiveFour(x))
            System.out.println(true);
        else
            System.out.println(false);
    }

    public static boolean isConsecutiveFour(int[][] values){
        int p=0;
        for(int i=0;i<values.length;i++){
            for(int j=0;j<values[i].length-3;j++){
                if((values[i][j]==values[i][j+1]&&values[i][j]==values[i][j+2]&&
                        values[i][j]==values[i][j+3])||
                        (values[j][i]==values[j+1][i]&&values[j][i]==values[j+2][i]&&
                        values[j][i]==values[j+3][i]))
                    return true;
            }
        }

        for(int i=0;i<values.length-3;i++){
            if(values[i][i]==values[i+1][i+1]&&values[i][i]==values[i+2][i+2]&&
                    values[i][i]==values[i+3][i+3])
                return true;
            if(values[i][values.length-3-i]==values[i+1][values.length-4-i]&&
                    values[i][values.length-3-i]==values[i+2][values.length-5-i]&&
                    values[i][values.length-3-i]==values[i+3][values.length-6-i])
                return true;
        }

        return false;


    }
}
