package brness.pac6.OneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] skt=str.toCharArray();
        partition(skt,0,skt.length-1);
        System.out.println("The ordered String is :"+ Arrays.toString(skt));
    }

    public static void partition(char[] list,int low,int high){
        if(low>high)
            return;
        int i=low;
        int j=high;
        char key=list[low];//一趟快排先将关键字赋值给key
        while (i<j){
            while(i<j&&key<list[j])//从后往前比较
                j--;
            swap(list,i,j);//交换两者的位置
            while(i<j&&key>list[i])//从前向后比较
                i++;
            swap(list,i,j);//交换两者位置
        }
        partition(list,low,i-1);
        partition(list,i+1,high);
    }

    public static void swap(char[] list,int x,int y){
        char temp=list[x];
        list[x]=list[y];
        list[y]=temp;
    }

}
