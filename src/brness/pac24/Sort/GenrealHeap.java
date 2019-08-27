package brness.pac24.Sort;

import java.util.Arrays;

public class GenrealHeap {
    public static void main(String[] args) {
        Integer[] list={2,9,5,4,8,1,6};
        heapSort(list);
        System.out.print(Arrays.toString(list));
    }

    private static <E extends Comparable<E>> void heapSort(E[] list){
        Heap<E> heap=new Heap<>();
        for (int i=0;i<list.length;i++){
            heap.add(list[i]);
        }

        for (int i=0;i<list.length;i++)
            list[i]=heap.remove();
    }
}
