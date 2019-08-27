package brness.pac12.Abstract;

abstract class GeometricObject{
    private String color;
    private boolean filled;

    protected GeometricObject(){
        color="white";
        filled=false;
    }

    abstract double getArea();

    abstract double getdiameter();
}
public class NewTriangle extends GeometricObject{
    private double length;

    public NewTriangle(double length){
        super();
        this.length=length;
    }

    public double getArea(){
        return length+1;
    }

    public double getdiameter(){
        return length;
    }
}
