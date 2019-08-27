package brness.pac10.Extends;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxArrayList {
    public static void main(String[] args) {
        System.out.println("Enter a series of number(0 ends): ");
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int k=s.nextInt();
        while (k!=0){
            list.add(k);
            k=s.nextInt();
        }
        int max=max(list);
        System.out.println("The max of the arraylist is "+max);
    }

    public static Integer max(ArrayList<Integer> list){
        if(list.size()==0){
            return null;
        }
        int max=list.get(0);
        for(int i=0;i<list.size();i++){
            if(max<list.get(i))
                max=list.get(i);
        }
        return max;
    }
}
