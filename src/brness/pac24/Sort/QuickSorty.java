package brness.pac24.Sort;
/**
 * 快速排序使用两个指针，分别指向该数组的首位位置,pivot表示的要比较的元素，如果a[j]>pivot,j--
 * 否则a[i]=a[j],再判断a[i]<pivot,i++,否则a[j]=a[i]，直到i=j，这时候再把a[i]或a[j]的值付给pivot
 * 这就是一趟快排
 */

import java.util.Arrays;

public class QuickSorty {
    public static void main(String[] args) {
        int[] x={2,3,2,5,6,1,-2,3,-14,12};
        quicksort(x);
        System.out.println(Arrays.toString(x));
    }

    public static void quicksort(int[] list){
        quicksort(list,0,list.length-1);
    }

    public static void quicksort(int[] list,int start,int end) {
        if (start<end){
            int index=partition(list,start,end);
            quicksort(list,start,index-1);
            quicksort(list,index+1,end);
        }

    }

    public static int partition(int[] list,int start,int end){
        int pivot = list[start];
        while (start < end) {
            while (pivot <= list[end] && start < end) {
                end--;
            }
            if (start<end)
                list[start] = list[end];
            while (pivot > list[start] && start < end) {
                start++;
            }
            if (start<end)
                list[end] = list[start];
        }
        list[end] = pivot;
        return end;
    }
}
