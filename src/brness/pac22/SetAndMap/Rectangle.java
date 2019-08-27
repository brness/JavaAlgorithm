package brness.pac22.SetAndMap;

public class Rectangle extends GeomotricObject {
    private double width;
    private double length;

    public Rectangle(){}

    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getArea(){return width*length;}

    public double getPerimeter(){return length;}
}
