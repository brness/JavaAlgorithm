package brness.pac10.Extends;
/*
构造方法只能调用，不能继承
所以对于多态而言，他们的构造方法第一句都是super()；
 */
public class Test {
    public static void main(String[] args) {
        Object circle1=new Circle();
        Object circle2=new Circle();

        System.out.println(circle1.equals(circle2));

//        new A(3);

//        new A();
//        new B();//注意这里是无参的构造方法，他会先调用父类的构造方法，方法的链式结构
    }
}

//class A{
//    int i=7;
//
//    public A(){
//        setI(20);
//        System.out.println("i from A is "+i);
//    }
//
//    public void setI(int i){
//        this.i=2*i;
//    }
//}
//
//class B extends A{
//    public B(){
//        System.out.println("i from B is "+i);
//    }
//
//    public void setI(int i){
//        this.i=3*i;
//    }
//}


//class A extends B{
//    public A(int t){
//        super(t);
//        System.out.println("A is working");
//    }
//}
//
//class B{
//    public B(){
//        System.out.println("B is working");
//    }
//
//    public B(int x){}
//}

//class Circle{
//    double radius;
//
//    public boolean equals(Circle circle){
//        return this.radius==circle.radius;
//    }
//}

class Circle {
    double radius;

    public boolean equals(Object circle){
        return this.radius==((Circle)circle).radius;
    }
}