package brness.pac6.OneDimensionArray;

import java.util.Arrays;

public class QuickSort {
    public static void sort(char a[], int low, int hight) {
        int i, j;
        char index;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        index = a[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && a[j] >= index)
                j--;
            swap(a,i,j);// 用比基准小的记录替换低位记录
            while (i < j && a[i] < index)
                i++;
            swap(a,i,j); // 用比基准大的记录替换高位记录

        }
        sort(a, low, i - 1); // 对低子表进行递归排序
        sort(a, i + 1, hight); // 对高子表进行递归排序

    }
    public static void swap(char[] list,int x,int y){
        char temp=list[x];
        list[x]=list[y];
        list[y]=temp;
    }

    public static void quickSort(char a[]) {
        sort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {

        char a[] = {'e','d','a','t','q'};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
