package brness.pac22.SetAndMap;

import java.util.Arrays;
import java.util.HashSet;

public class TestHash {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        String[] s1={"George","Jim","Blake","Kevin","Michael"};
        String[] s2={"George","Katie","Kevin","Michelle","Ryan"};

        HashSet<String> set1=new HashSet<>(Arrays.asList(s1));
        HashSet<String> set2=new HashSet<>(Arrays.asList(s2));

        HashSet<String> set3=set1;
        HashSet<String> set4=set1;

        set1.addAll(set2);
        System.out.println("The add up of the set is "+set1);

        set3.removeAll(set2);
        System.out.println("The subtract of the set is "+set3);

        set4.containsAll(set2);
        System.out.println("The intersection of the set is "+set4);
    }
}
