package brness.pac21.DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        List<Integer> arraylist=new ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(1);
        arraylist.add(4);
        arraylist.add(0,10);
        arraylist.add(3,30);

        System.out.println("A list of integers in the array list:");
        System.out.println(arraylist);

        LinkedList<Object> linkedList=new LinkedList<>(arraylist);
        linkedList.add(1,"red");
        linkedList.removeLast();
        linkedList.addFirst("green");

        System.out.println("Display the linked list forward:");
        ListIterator<Object> listIterator=linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next()+" ");
        }

        System.out.println("Display the linked list backward:");
        listIterator=linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous()+" ");
        }
    }
}
