package brness.pac24.Sort;

import java.util.Arrays;

/**
 * 对于归并排序，基本想法是将数组一半一半叉开，直到剩最后一个元素，再将两个已经排好序的数组合并起来，最后得到的就是
 * 一个完整的数组
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] x={2,3,2,5,6,1,-2,3,-14,12};
        mergesort(x);
        System.out.println(Arrays.toString(x));
    }
    public static void mergesort(int[] list){
        if (list.length>1){
            int[] first=new int[list.length/2];
            System.arraycopy(list,0,first,0,list.length/2);
            mergesort(first);

            int[] second=new int[list.length-list.length/2];
            System.arraycopy(list,list.length/2,second,0,list.length-list.length/2);
            mergesort(second);

            merge(first,second,list);
        }
    }

    public static void merge(int[] list1,int[] list2,int[] list){
        int temp1=0;
        int temp2=0;
        int temp3=0;

        while (temp1<list1.length&&temp2<list2.length){
            if (list1[temp1]<=list2[temp2])
                list[temp3++]=list1[temp1++];
            else list[temp3++]=list2[temp2++];
        }
        while (temp1<list1.length){
            list[temp3++]=list1[temp1++];
        }
        while(temp2<list1.length)
            list[temp3++]=list2[temp2++];
    }
}
