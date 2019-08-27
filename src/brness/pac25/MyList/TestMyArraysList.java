package brness.pac25.MyList;

import java.util.List;

public class TestMyArraysList {
    public static void main(String[] args) {
//        MyList<String> list=new MyArrayList<>();
//
//        list.add("America");
//        System.out.println("(1)"+list);
//
//        list.add(0,"Canada");
//        System.out.println("(2)"+list);
//
//        list.add("Russia");
//        System.out.println("(3)"+list);
//
//        list.add("France");
//        System.out.println("(4)"+list);
//
//        list.add(2,"Germany");
//        System.out.println("(5)"+list);
//
//        list.remove("Canada");
//        System.out.println("(6)"+list);
//
//        list.remove(2);
//        System.out.println("(7)"+list);
//
//        for (String s:list){
//            System.out.print(s.toUpperCase()+" ");
//        }

//        MyArrayList<Double> list=new MyArrayList<>();
//        list.add(1.5);
//        System.out.println(list.size);
//
//        list.trimToSize();
//        System.out.println(list.size);
//
//        list.add(3.4);
//        System.out.println(list.size);
//
//        list.add(7.4);
//        System.out.println(list.size);
//
//        list.add(17.3);
//        System.out.println(list.size);

        MyArrayList<Double> list=new MyArrayList<>();
        System.out.print(list.size);
        list.trimToSize();
        list.add(9.8);
    }
}
