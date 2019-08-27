package brness.pac21.DataStructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class TestLinked {
    public static void main(String[] args) {
        System.out.println("Enter the numbers:");
        Scanner s=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        for (int i=0;i<5;i++){
            int x=s.nextInt();
            if (!list.contains(x))
                list.add(x);
        }
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
