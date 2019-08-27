package brness.pac22.SetAndMap;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        TreeSet<String> treeSet=new TreeSet<>(set);
        System.out.println("Sorted tree set: "+treeSet);

        System.out.println("first()"+treeSet.first());
        System.out.println("last()"+treeSet.last());
        System.out.println("headSet:New York"+treeSet.headSet("New York"));
        System.out.println("tailSet:New York"+treeSet.tailSet("New York"));
        System.out.println("PollFirst(): "+treeSet.pollFirst());
        System.out.println("PollLast(): "+treeSet.pollLast());
        System.out.println("New tree set: "+treeSet);
    }
}
