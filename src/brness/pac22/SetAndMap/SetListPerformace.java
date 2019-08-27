package brness.pac22.SetAndMap;

import org.omg.CORBA.INTERNAL;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SetListPerformace {
    static final int N=50000;

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<N;i++){
            list.add(i);
        }
        Collections.shuffle(list);

        Collection<Integer> set1=new HashSet<>(list);
        System.out.println("Member test time for hash set is "+getTestTime(set1));
        System.out.println("Member removed for hash set is "+getRemoveTime(set1));

        Collection<Integer> set2=new LinkedHashSet<>(list);
        System.out.println("Member test time for linked hash set is "+getTestTime(set2));
        System.out.println("Member removed for linked hash set is "+getRemoveTime(set2));

        Collection<Integer> set3=new TreeSet<>(list);
        System.out.println("Member test time for tree set is "+getTestTime(set3));
        System.out.println("Member removed for tree set is "+getRemoveTime(set3));

        Collection<Integer> set4=new ArrayList<>(list);
        System.out.println("Member test time for array list is "+getTestTime(set4));
        System.out.println("Member removed for array list is "+getRemoveTime(set4));

        Collection<Integer> set5=new LinkedList<>(list);
        System.out.println("Member test time for linked list is "+getTestTime(set5));
        System.out.println("Member removed for linked list is "+getRemoveTime(set5));
    }

    public static long getTestTime(Collection<Integer> c){
        long starttime=System.currentTimeMillis();

        for (int i = 0; i <N ; i++) {
            c.contains((int)(Math.random()*2*N));
        }

        return System.currentTimeMillis()-starttime;
    }

    public static long getRemoveTime(Collection<Integer> c){
        long starttime=System.currentTimeMillis();

        for (int i = 0; i <N ; i++) {
            c.remove(i);
        }
        return System.currentTimeMillis()-starttime;
    }
}
