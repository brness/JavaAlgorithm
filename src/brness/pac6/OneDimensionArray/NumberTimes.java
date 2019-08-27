package brness.pac6.OneDimensionArray;

import java.util.Scanner;

public class NumberTimes {
    public static void main(String[] args) {
        System.out.println("Enter a series of number(0 ends): ");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int[] a=new int[100];
        int[] b=new int[101];
        int i=0;
        while(x!=0){
            a[i]=x;
            i++;
            x=s.nextInt();
        }
        for(int k=0;k<a.length;k++){
            b[a[k]]++;
        }
        for(int k=1;k<b.length;k++){
            if(b[k]>1){
                System.out.println(k+" occurs "+b[k]+" times");
            }
            else if(b[k]>0)
                System.out.println(k+" occurs "+b[k]+" time");
        }
    }
}
