package brness.pac7.MultiDimensionArray;

import java.util.Scanner;

public class ExploreMatrix {
    public static void main(String[] args) {
        System.out.println("Enter the size of the matrix: ");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[][] matrix=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j]=(int)(Math.random()*2);
            }
        }
        int[] row=new int[size];
        int[] column=new int[size];
        int diagonal=0;
        int subdiagonal=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(matrix[i][j]!=matrix[i][j+1])
                    row[i]=1;//判断第i行的元素是不是相同，不相同输出1
                if(matrix[j][i]!=matrix[j+1][i])
                    column[i]=1;//判断第i列的元素是不是相同，不相同输出1
            }
        }

        for(int i=0;i<size-1;i++){
            if(matrix[i][i]!=matrix[i+1][i+1])
                diagonal=1;
            if(matrix[i][size-1-i]!=matrix[i+1][size-2-i])
                subdiagonal=1;
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        int r=0;
        int c=0;
        for(int i=0;i<size;i++){
            if(row[i]==0){
                r=1;
                System.out.println("All "+matrix[i][i]+" is on row "+i);
            }
            if(column[i]==0){
                c=1;
                System.out.println("All "+matrix[i][i]+" is on column "+i);
            }
        }
        if(r==0)
            System.out.println("No same numbers on a row");
        if(c==0)
            System.out.println("No same numbers on a column");

        if(diagonal==1)
            System.out.println("No same numbers on a major diagonal");
        else
            System.out.println("All "+matrix[1][1]+" is on the major diagonal");
        if(subdiagonal==1)
            System.out.println("No same numbers on a sub diagonal");
        else
            System.out.println("All "+matrix[1][1]+" is on the sub diagonal");
    }
}
