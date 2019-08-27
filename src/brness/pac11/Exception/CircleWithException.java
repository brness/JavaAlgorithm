package brness.pac11.Exception;

public class CircleWithException {
    private double radius=1;
    private static int numberofObjects=0;

    public CircleWithException(){
        numberofObjects++;
    }

    public CircleWithException(double newradius){
        setRadius(newradius);
        numberofObjects++;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0)
            throw new IllegalArgumentException("Radius can't be a negative");
        else this.radius=radius;
    }

    public static int getNumberofObjects(){
        return numberofObjects;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

}
