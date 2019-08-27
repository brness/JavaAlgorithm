package brness.pac9.TheThinkingOfObject;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate my1=new MyDate();
        System.out.println(my1.getDay()+":"+my1.getMonth()+":"+my1.getYear());

        MyDate my2=new MyDate(561555550000L);
        System.out.println(my2.getDay()+":"+my2.getMonth()+":"+my2.getYear());
    }
}
