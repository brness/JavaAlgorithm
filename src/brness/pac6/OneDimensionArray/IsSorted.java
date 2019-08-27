package brness.pac6.OneDimensionArray;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        System.out.println("Enter list: ");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] list=new int[size];
        for(int i=0;i<size;i++){
            list[i]=s.nextInt();
        }
        if(isSorted(list))
            System.out.println("The list is sorted");
        else
            System.out.println("The list is not sorted");
    }

    public static boolean isSorted(int[] l){
        for(int k=0;k<l.length-1;k++) {
            if (l[k] > l[k+1]) {
                for (int i = 1; i < l.length - 1; i++) {
                    if (l[i] < l[i + 1])
                        return false;
                }
                return true;
            }
            else if(l[k]<l[k+1]){
                for (int i = 1; i < l.length - 1; i++) {
                    if (l[i] > l[i + 1])
                        return false;
                }
                return true;
            }
        }
        return false;
    }
}
