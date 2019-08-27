package brness.pac12.Abstract;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        ArrayList<Number> l=new ArrayList<>();
        for(int i=0;i<10;i++){
            l.add(i);
        }
        shuffle(l);
        for(int i=0;i<10;i++){
            System.out.println(l.get(i));
        }
    }

    public static void shuffle(ArrayList<Number> list){
        for(int i=0;i<list.size();i++){
            Number temp=list.get(i);
            int p=(int)(Math.random()*list.size());
            list.set(i,list.get(p));
            list.set(p,temp);
        }
    }
}
