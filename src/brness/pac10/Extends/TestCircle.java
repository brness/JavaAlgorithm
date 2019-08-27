package brness.pac10.Extends;

public class TestCircle {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle=new CircleFromSimpleGeometricObject(1);
        System.out.println("A circle "+circle.toString());
        System.out.println("The color is "+circle.getColor());
        System.out.println("The radius is "+circle.getRadius());
        System.out.println("The area is "+circle.getArea());
        System.out.println("The diameter is "+circle.getDiameter());
    }
}
