package brness.pac24.Sort;

import java.util.Arrays;

public class GeneralQiuck {
    public static void main(String[] args) {
        Integer[] t=new Integer[50000];
        for(int i=0;i<50000;i++){
            t[i]=(int)(Math.random()*100000);
        }
        quickSort(t);
        System.out.print(Arrays.toString(t));
    }

    public static <E extends Comparable<E>> void quickSort(E[] list){
        quickSort(0,list.length-1,list);
    }

    public static <E extends Comparable<E>> void quickSort(int head,int tail,E[] list){
        int first=head;
        int last=tail;
        if (head<tail){
            E pivot=list[head];
            while(head<tail){
                while (pivot.compareTo(list[tail])<0&&head<tail)
                    tail--;
                if (head<tail)
                    list[head]=list[tail];

                while (pivot.compareTo(list[head])>=0&&head<tail)
                    head++;
                if (head<tail)
                    list[tail]=list[head];
            }
            list[tail]=pivot;

            quickSort(first,tail-1,list);
            quickSort(tail+1,last,list);
        }
    }
}
