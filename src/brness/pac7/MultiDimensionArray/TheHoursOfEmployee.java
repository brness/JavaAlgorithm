package brness.pac7.MultiDimensionArray;

import java.util.Arrays;

public class TheHoursOfEmployee {
    public static void main(String[] args) {
        int[][] works={
                {2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},
                {9,3,4,7,3,4,1},{3,5,4,3,6,3,8},{3,4,4,6,3,4,4},
                {3,7,4,8,3,8,4},{6,3,5,9,2,7,9}};
        int[] sum=new int[8];
        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                sum[i]=works[i][j]+sum[i];
            }
        }
        int[] index={0,1,2,3,4,5,6,7};


        //用的是选择排序
        for(int i=0;i<8;i++){
            int max=sum[i];
            int p=i;
            for(int j=i;j<8;j++){
                if(sum[j]>max){
                    max=sum[j];
                    p=j;
                }
            }
            //将索引下标和数组下标同时变换，最后将两个同时输出
            int temp=sum[i];
            sum[i]=sum[p];
            sum[p]=temp;
            int t=index[i];
            index[i]=index[p];
            index[p]=t;
        }

        System.out.println(Arrays.toString(index));
        System.out.println(Arrays.toString(sum));
    }
}
