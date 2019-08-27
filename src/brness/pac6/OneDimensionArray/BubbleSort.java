package brness.pac6.OneDimensionArray;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        double[] list={5,16,9,78,4,27,28,0,27,7};
        boolean changed = true;
        //用boolean来判断数组是不是有变化，如果有则继续遍历
        do {
            changed = false;
            for (int j = 0; j < list.length - 1; j++)
                if (list[j] > list[j+1]) {
                    //swap list[j] with list[j+1]
                    double temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    changed = true;
                }
        } while (changed);
        System.out.println(Arrays.toString(list));
    }
}
