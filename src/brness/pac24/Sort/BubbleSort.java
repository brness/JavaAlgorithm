package brness.pac24.Sort;

import java.util.Arrays;

/**
 * 冒泡排序是两两比较，大的数向下沉
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] x={2,9,5,4,8,1,6};
        bubble(x);
    }
    public static void bubble(int[] a){
        for (int i=0;i<a.length;i++){
            //冒泡排序注意一下顺序
            for (int j=a.length-1;j>i;j--){
                if (a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
