package brness.pac10.Extends;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteDuplicate {
    public static void main(String[] args) {
        System.out.println("Enter ten integers: ");
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int m=s.nextInt();
        int k=1;
        while(k<10){
            if(!list.contains(m))
                list.add(m);
            m=s.nextInt();
            k++;
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
