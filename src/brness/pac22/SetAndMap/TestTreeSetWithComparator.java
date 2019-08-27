package brness.pac22.SetAndMap;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetWithComparator {
    public static void main(String[] args) {
        Set<GeomotricObject> set=new TreeSet<>();
        set.add(new Rectangle(4,5));
        set.add(new Circle(40));
        set.add(new Circle(40));
        set.add(new Rectangle(4,1));

        System.out.println("A sorted set of geometric objects");
        for (GeomotricObject elmet:set){
            System.out.println("Area= "+elmet.getArea());
        }
    }
}
