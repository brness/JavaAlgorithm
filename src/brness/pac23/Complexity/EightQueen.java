package brness.pac23.Complexity;

import java.util.Arrays;

public class EightQueen {
    public static final int SIZE=8;
    public static void main(String[] args) {
        int[] queens={-1,-1,-1,-1,-1,-1,-1,-1};
        if (search(queens))
            System.out.println(Arrays.toString(queens));
        else
            System.out.println("Not Found");
    }

    public static boolean search(int[] queens){
        int k=0;
        while (k>=0&&k<SIZE){
            int j=findPosition(k,queens);
            if (j<0){
                queens[k]=-1;
                k--;
            }
            else {
                queens[k]=j;
                k++;
            }
        }
        if (k==-1)
            return false;
        else
            return true;
    }

    public static int findPosition(int k,int[] queens){
        int start=queens[k]+1;
        for (int j=start;j<SIZE;j++){
            if (isValid(k,j,queens))
                return j;
        }
        return -1;
    }

    public static boolean isValid(int row,int column,int[] queens){
        for(int i=1;i<=row;i++){
            if (queens[row-i]==column||queens[row-i]==column-i||queens[row-i]==column+i)
                return false;
        }
        return true;
    }
}
