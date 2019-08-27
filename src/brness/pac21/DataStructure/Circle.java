package brness.pac21.DataStructure;

public class Circle extends GeomotricObject{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getDiameter(){
        return 2*radius;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return ("area is "+this.getArea());
    }
}
