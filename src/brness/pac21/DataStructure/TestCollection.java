package brness.pac21.DataStructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class TestCollection {
    public static void main(String[] args) {
        Vector<String> collections1=new Vector<>();
        collections1.add("New York");
        collections1.add("Atlanta");
        collections1.add("Dallas");
        collections1.add("Madison");

        System.out.println("A list of cities in collection1:");
        System.out.println(collections1);

        System.out.println("\nIs Dallas in collection1?: "+collections1.contains("Dallas"));

        collections1.remove("Dallas");
        System.out.println("\n"+collections1.size()+" cities are in collection1 now");

        Collection<String> collection=new Vector<>();
        collection.add("Seattle");
        collection.add("Portland");
        collection.add("Los Angles");
        collection.add("Atlanta");

        System.out.println("\nA list of  cities in collection:");
        System.out.println(collection);

        Vector<String> c1=(Vector<String>)(collections1.clone());
        c1.addAll(collection);
        System.out.println("\nCities in collection1 or collection2:");
        System.out.println(c1);

        c1=(Vector<String>)(collections1.clone());
        c1.retainAll(collection);
        System.out.println("\nCities in collection1 and collection2:");
        System.out.println(c1);

        c1=(Vector<String>)(collections1.clone());
        c1.removeAll(collection);
        System.out.println("\nCities in collection1 but not in collection2:");
        System.out.println(c1);
    }
}
