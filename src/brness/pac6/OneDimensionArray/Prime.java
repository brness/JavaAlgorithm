package brness.pac6.OneDimensionArray;

import java.util.Arrays;

public class Prime {
    public static void main(String[] args) {
        int i=0;
        int k=2;
        int[] num=new int[50];
        while(i<50){
            int flag=0;
            for(int j=2;j<=Math.sqrt(k);j++){
                if(k%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                num[i]=k;
                i++;
            }
            k++;
        }
        System.out.println(Arrays.toString(num));
    }
}
