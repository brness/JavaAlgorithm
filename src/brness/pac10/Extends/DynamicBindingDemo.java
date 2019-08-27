package brness.pac10.Extends;
/*
动态绑定的原因在于其多态的特点。即只要是父类对象能使用的方法，
子类就一定能使用，而且使用的时候是以子类的方法优先
 */
public class DynamicBindingDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }

    public static void m(Object x){
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student{
}

class Student extends Person{
    public String toString(){
        return "Student";
    }
}

class Person extends Object{
    @Override
    public String toString() {
        return "Person";
    }
}
