package brness.pac7.MultiDimensionArray;

import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 to 511:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String num=Integer.toBinaryString(a);
        char[] inter=num.toCharArray();
        char[] show=new char[9];
        int j=8;
        for(int i=inter.length-1;i>=0;j--,i--){
            if(inter[i]=='1')
                show[j]='T';
            else
                show[j]='H';
        }
        while(j>=0){
            show[j]='H';
            j--;
        }

        for(int i=0;i<9;i++){
            System.out.print(show[i]);
            if((i+1)%3==0)
                System.out.println();
        }
    }
}
