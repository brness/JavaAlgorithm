package brness.pac22.SetAndMap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception{
//        Set<String> set=new HashSet<>();
//        set.add("fas");
//        set.add("asd");
//        set.add("das");
//        set.add("dasasdf");
//        set.add("wehew");
//
//        for (String s:set){
//            System.out.println(s);
//        }

//        LinkedHashSet<String> set1=new LinkedHashSet<>();
//        set1.add("New York");
//        LinkedHashSet<String> set2=set1;
//        LinkedHashSet<String> set3=(LinkedHashSet<String>)(set1.clone());
//        set1.add("Atlanta");
//        System.out.println("set1 is "+set1);
//        System.out.println("set2 is "+set2);
//        System.out.println("set3 is "+set3);

        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("test.dat"));
        LinkedHashSet<String> set1=new LinkedHashSet<>();
        set1.add("New York");
        LinkedHashSet<String> set2=(LinkedHashSet<String>)(set1.clone());
        set1.add("Atlanta");
        outputStream.writeObject(set1);
        outputStream.writeObject(set2);
        outputStream.close();


        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("test.dat"));
        set1=(LinkedHashSet<String>)inputStream.readObject();
        set2=(LinkedHashSet<String>)inputStream.readObject();
        System.out.println(set1);
        System.out.println(set2);
        inputStream.close();
    }
}
