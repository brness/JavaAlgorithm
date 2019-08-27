package brness.pac24.Sort;

import java.util.Arrays;

public class UpdateMergeSort {
    public static void main(String[] args) {
        int[] x={2,3,2,5,6,1,-2,3,-14,12};
        int[] y=new int[x.length];
        MergeSort(x,0,x.length-1,y);
        System.out.print(Arrays.toString(x));
    }

    public static void MergeSort(int[] list,int start,int end,int[] temp){
        if (end>start){
            int mid=(start+end)/2;
            MergeSort(list,start,mid,temp);
            MergeSort(list,mid+1,end,temp);

            merge(list,start,mid,end,temp);
        }
    }

    //将list[start....mid]与list[mid+1...end]两个数组合并
    public static void merge(int[] list,int start,int mid,int end,int[] temp){
        int i=start,j=mid+1;
        int m=mid,n=end;
        int k=0;

        while(i<=m&&j<=n){
            if (list[i]<list[j])
                temp[k++]=list[i++];
            else temp[k++]=list[j++];
        }

        while (i<=m)
            temp[k++]=list[i++];
        while(j<=m)
            temp[k++]=list[j++];

        //将temp数组重新复制给原始数组
        for (i=0;i<k;i++){
            list[start+i]=temp[i];
        }

    }
}
