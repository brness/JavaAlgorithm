package brness.pac6.OneDimensionArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortStudent {
    public static void main(String[] args) {
        System.out.println("Enter the numbers of students:");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println("Enter the names of students:");
        String[] names=new String[num];
        for(int i=0;i<num;i++){
            names[i]=s.next();
        }
        System.out.println("Enter the grades: ");
        int[] grades=new int[num];
        for(int i=0;i<num;i++){
            grades[i]=s.nextInt();
        }

        for(int i=0;i<num;i++){
            //找到J到num最大的元素
            int max=0;
            int k=i;
            for(int j=i+1;j<num;j++){
                if(grades[j]>=max){
                    k=j;
                    max=grades[j];
                }
            }

            String temp=names[i];
            names[i]=names[k];
            names[k]=temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
