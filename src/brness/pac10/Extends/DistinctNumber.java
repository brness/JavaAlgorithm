package brness.pac10.Extends;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        while(k!=0){
            if(!list.contains(k)&&k!=0) {
                list.add(k);
            }
            k=s.nextInt();
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
