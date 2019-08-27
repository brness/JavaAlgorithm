package brness.pac6.OneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDifferent {
    public static void main(String[] args) {
        System.out.println("Enter ten numbers: ");
        Scanner s=new Scanner(System.in);
        int[] num=new int[10];
        for(int i=0;i<10;i++){
            int x=s.nextInt();
            num[i]=x;
        }

        int[] newnum=new int[10];
        int j=0;
        for(int i=0;i<10;i++){
            if(compare(num[i],newnum,j)){
                newnum[j]=num[i];
                j++;
            }
        }
        for(int i=0;i<10;i++){
            if(newnum[i]!=0){
                System.out.println(newnum[i]);
            }
        }
    }

    //查找x是否在l[flag]-l[0]之间
    public static boolean compare(int x,int[] l,int flag){
        for(int i=0;i<=flag;i++){
            if(l[i]==x)
                return false;
        }
        return true;
    }
}
