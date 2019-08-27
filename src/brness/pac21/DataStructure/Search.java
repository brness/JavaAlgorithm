package brness.pac21.DataStructure;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Search {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for (int i=0;i<5000000;i++){
            list.addLast((int)(Math.random()*10000000));
        }
        Iterator<Integer> integerIterator=list.listIterator();
        long begin=new Date().getTime();
        for(int l:list){
//            System.out.println(l);
        }
        long end=new Date().getTime();
        System.out.println("The iterator time is "+(end-begin));

        begin=System.currentTimeMillis();
        for(int i=0;i<5000000;i++){
//            System.out.println(list.get(i));
        }
        end=System.currentTimeMillis();
        System.out.println("The list time is "+(end-begin));
    }
}
