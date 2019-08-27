package brness.pac9.TheThinkingOfObject;

public class TestMyString1 {
    public static void main(String[] args) {
        MyString1 s=new MyString1(new char[] {'a', 'b', 'c'});

        MyString1 s1=new MyString1(new char[] {'a','a','a'});
        System.out.println(s.charAt(1));

        System.out.println(s.length());

        System.out.println(s.substring(0,2).getStr());

        System.out.println(s.equals(s1));
    }
}
