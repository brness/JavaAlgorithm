package brness.pac24.Sort;

import java.util.Arrays;

/**
 * 插入排序是将第二个数作为主元，依次比较前面已经排好序的数组，插入适当的位置。
 * 这里我们会用一个current代表这个数，对于前面的数组，while循环，如果比current大，则a[j+1]=a[j]
 * 最后插入current到a[j+1]
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] x={2,9,5,4,8,1,6};
        insertSo(x);
        System.out.println(Arrays.toString(x));
    }
    public static int[] insertSo(int[] a){
        for (int i=1;i<a.length;i++){
            int currentElement=a[i];
            int j;
            for (j=i-1;j>=0&&a[j]>currentElement;j--){
                a[j+1]=a[j];
            }
            a[j+1]=currentElement;
        }
        return a;
    }
}
