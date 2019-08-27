package brness.pac24.Sort;

import java.util.Arrays;
import java.util.Comparator;

public class GeneralMergeSort {
    public static void main(String[] args) {
        Integer[] t={1,2,4,5,6,8,2,4,5,1,2,3};
        mergeSort(t);
        System.out.print(Arrays.toString(t));
    }

    public static <E extends Comparable<E>> void mergeSort(E[] list){
        if (list.length>1){
            E[] first=(E[])new Comparable[list.length/2];
            System.arraycopy(list,0,first,0,list.length/2);
            mergeSort(first);

            E[] last=(E[])new Comparable[list.length-list.length / 2];
            System.arraycopy(list,list.length/2,last,0,list.length-list.length/2);
            mergeSort(last);

            merge(first,last,list);
        }
    }

    public static <E extends Comparable<E>> void merge(E[] first,E[] last,E[] list){
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length&&j<last.length) {
            if (first[i].compareTo(last[j]) < 0)
                list[k++] = first[i++];
            else list[k++]=last[j++];
        }

        while (i<first.length)
            list[k++]=first[i++];
        while (j<last.length)
            list[k++]=last[j++];
    }
}
