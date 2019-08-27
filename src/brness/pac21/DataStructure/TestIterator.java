package brness.pac21.DataStructure;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList<String> collections1=new ArrayList<>();
        collections1.add("New York");
        collections1.add("Atlanta");
        collections1.add("Dallas");
        collections1.add("Madison");

        for(int i=0;i<collections1.size();i++){
            System.out.println(collections1.get(i).toUpperCase());
        }
//        Iterator<String> iterator=collections1.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next().toUpperCase()+" ");
//        }
    }
}
