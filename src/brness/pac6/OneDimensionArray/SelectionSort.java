package brness.pac6.OneDimensionArray;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] l={5,16,9,78,4,27,28,0,27,7};
        for(int i=0;i<l.length/*最后一个元素不需要比较*/;i++){
            int k=max(l,i);
            int temp=l[i];
            l[i]=l[k];
            l[k]=temp;
        }
        System.out.println("The selection sort of the array is :");
        System.out.println(Arrays.toString(l));
//        for(int i=0;i<l.length;i++)
//            System.out.print(l[i]+" ");
    }

    public static int max(int[] l,int x){
        int max=0;
        int k=x;
        for(int i=x+1/*从i+1开始选取最大的数值*/;i<l.length;i++){
            if(l[i]>=max){
                k=i;
                max=l[i];
            }
        }
        return k;
    }
}
