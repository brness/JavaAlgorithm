package brness.pac12.Abstract;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle c1=new ComparableCircle(6);
        ComparableCircle c2=new ComparableCircle(4);
        int p=c1.compareTo(c2);
        if(p==1)
            System.out.println(c1.getArea());
        else if(p==-1)
            System.out.println(c2.getArea());
        else
            System.out.println(c1.getArea());
    }
}
