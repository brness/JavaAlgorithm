package brness.pac25.MyList;

public class TestNewMyList {
    public static void main(String[] args) {
        String[] arg1={"Tom","George","Peter","Jean","Jane"};
        String[] arg2={"Tom","Micheal","George","Michelle","Daniel"};
        MyList<String> list1=new MyArrayList<>(arg1);
        MyList<String> list2=new MyArrayList<>(arg2);

        list1.addAll(list2);
        System.out.println(list1);

        list1=new MyArrayList<>(arg1);
        list1.removeALl(list2);
        System.out.println(list1);

        list1=new MyArrayList<>(arg1);
        list1.retainAll(list2);
        System.out.println(list1);
    }
}
