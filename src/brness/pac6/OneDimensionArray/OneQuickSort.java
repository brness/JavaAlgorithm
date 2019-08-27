package brness.pac6.OneDimensionArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OneQuickSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the list: ");
        int size=s.nextInt();
        int[] list=new int[size];
        for(int i=0;i<size;i++){
            list[i]=s.nextInt();
        }

        partition(list,0,list.length-1);
        System.out.println("After the partition, the list is "+ Arrays.toString(list));
    }

    public static void partition(int[] list,int low,int high){
        if(low>=high)
            return ;
        int key=list[low];//一趟快排先将关键字赋值给key
        int i=low;
        int j=high;
        while (i<j){
            while(i<j&&key<list[j])//从后往前比较  这里i<j是必须的 要防止数组越界
                j--;
            swap(list,i,j);//交换两者的位置
            while(i<j&&key>list[i])//从前向后比较   这里i<j是必须的 要防止数组越界
                i++;
            swap(list,i,j);//交换两者位置
        }
        partition(list,low,i-1);
        partition(list,i+1,high);
    }

    public static void swap(int[] list,int x,int y){
        int temp=list[x];
        list[x]=list[y];
        list[y]=temp;
    }
}
