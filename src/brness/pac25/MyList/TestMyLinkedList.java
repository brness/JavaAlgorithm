package brness.pac25.MyList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list=new MyLinkedList<>();

        list.add("America");
        System.out.println("(1)"+list);

        list.add(0,"Canada");
        System.out.println("(2)"+list);

        list.add("Russia");
        System.out.println("(3)"+list);

        list.add("France");
        System.out.println("(4)"+list);

        list.add(2,"Germany");
        System.out.println("(5)"+list);

        list.remove("Canada");
        System.out.println("(6)"+list);

        list.remove(2);
        System.out.println("(7)"+list);

        for (String s:list){
            System.out.print(s.toUpperCase()+" ");
        }


    }
}
