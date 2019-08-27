package brness.pac22.SetAndMap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> strings=new LinkedHashSet<>();

        strings.add("London");
        strings.add("Paris");
        strings.add("Paris");
        strings.add("San Francisco");
        strings.add("Beijing");

        System.out.println(strings);

        for (String s:strings){
            System.out.println(s);
        }
    }
}
