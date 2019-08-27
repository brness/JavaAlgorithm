package brness.pac6.OneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class MergeList {
    public static void main(String[] args) {
        System.out.println("Enter list1: ");
        Scanner s=new Scanner(System.in);
        int length1=s.nextInt();
        int[] list1=new int[length1];
        for(int i=0;i<length1;i++){
            list1[i]=s.nextInt();
        }
        System.out.println("Enter list2: ");
        int length2=s.nextInt();
        int[] list2=new int[length2];
        for(int i=0;i<length2;i++){
            list2[i]=s.nextInt();
        }

        System.out.println("The merged list is "+ Arrays.toString(merge(list1,list2)));
    }

    public static int[] merge(int[] list1,int[] list2) {
        int length = list1.length + list2.length;
        int[] list = new int[length];
        int i = 0, j = 0, k = 0;
        while (i < list1.length && j < list2.length) {
            //小的数放入list中
            if (list1[i] <= list2[j])
                list[k++] = list1[i++];
            else
                list[k++] = list2[j++];
        }

        //判断哪个数组还有多余
        while (i<list1.length)
            list[k++]=list1[i++];
        while(j<list2.length)
            list[k++]=list2[j++];
        return list;
    }
}
