package brness.pac6.OneDimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class GordenBottle {
    public static void main(String[] args) {
        System.out.println("Enter the number of balls to drop: ");
        Scanner s=new Scanner(System.in);
        int balls=s.nextInt();
        System.out.println("Enter the number of slots in the bean machine: ");
        int slots=s.nextInt();
        int[] slot=new int[slots];
        for(int j=0;j<balls;j++) {
            int k=0;//记录每个球R的个数
            for (int i = 0; i < slots - 1; i++) {
                if (Math.random() > 0.5)
                    System.out.print("L");
                else {
                    k++;
                    System.out.print("R");
                }
            }
            slot[k]++;
            System.out.println();
        }

        System.out.print(Arrays.toString(slot));

    }
}
