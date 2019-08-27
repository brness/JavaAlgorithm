package brness.pac10.Extends;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        System.out.println("Enter five integers for the list1");
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<5;i++){
            list1.add(s.nextInt());
        }
        System.out.println("Enter five integers for the list2");
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<5;i++){
            list2.add(s.nextInt());
        }

        System.out.println("The combined list is "+ union(list1,list2));
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1,ArrayList<Integer> list2){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i).equals(list2.get(j)))
                    list1.remove(i);
            }
        }
        for(int i=0;i<list1.size();i++){
            for(int j=i+1;j<list1.size();j++) {
                if(list1.get(i).equals(list1.get(j)))
                    list1.remove(i);
            }
        }
        for(int i=0;i<list1.size();i++)
            list.add(list1.get(i));
        for(int j=0;j<list2.size();j++){
            list.add(list2.get(j));
        }
        return list;
    }
}
