package brness.pac10.Extends;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxRowAndColumn {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[][] m=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                m[i][j]=(int)(Math.random()*2);
            }
        }
        System.out.println("The random array is ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }

        ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> column=new ArrayList<>();

        for(int i=0;i<m.length;i++){
            int r=0;
            int c=0;
            for(int j=0;j<m[i].length;j++){
                r=r+m[i][j];
                c=c+m[j][i];
            }
            row.add(r);
            column.add(c);
        }

        int maxrow= Collections.max(row);
        int maxcolumn=Collections.max(column);

        for(int i=0;i<row.size();i++){
            if(row.get(i)==maxrow)
                System.out.println("The largest row index : "+i);
            if(column.get(i)==maxcolumn)
                System.out.println("The largest column index : "+i);
        }
    }
}
