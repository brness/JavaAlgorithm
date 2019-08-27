package brness.pac8.Object;

public class Date {
    public static void main(String[] args) {
        java.util.Date date=new java.util.Date();
        date.setTime(10000L);
        System.out.println(date.toString());
        date.setTime(100000L);
        System.out.println(date.toString());
        date.setTime(1000000L);
        System.out.println(date.toString());
        date.setTime(10000000L);
        System.out.println(date.toString());
        date.setTime(100000000L);
        System.out.println(date.toString());
        date.setTime(1000000000L);
        System.out.println(date.toString());
        date.setTime(10000000000L);
        System.out.println(date.toString());
        date.setTime(100000000000L);
        System.out.println(date.toString());
    }
}
