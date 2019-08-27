package brness.pac24.Sort;

import brness.pac11.Exception.CircleWithException;
import brness.pac21.DataStructure.GeomotricObject.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class GeneralBubble {
    public static void main(String[] args) {
        Integer[] list={2,9,5,4,8,1,6};
        bubblesort(list);
        System.out.print(Arrays.toString(list));

    }
    public static <E extends Comparable<E>> void bubblesort(E[] list){
        for (int i=0;i<list.length;i++){
            for (int j=0;j<list.length-i-1;j++){
                if (list[j].compareTo(list[j+1])>0){
                    E temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
    }

    public static <E> void bubblesort(E[] list, Comparator<? super E> comparator){
        for (int i=0;i<list.length;i++){
            for (int j=0;j<list.length-i-1;j++){
                if (comparator.compare(list[j],list[j+1])>0){
                    E temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
    }

}
