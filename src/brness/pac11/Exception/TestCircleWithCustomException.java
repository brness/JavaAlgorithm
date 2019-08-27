package brness.pac11.Exception;

public class TestCircleWithCustomException {
    public static void main(String[] args) {
        try {
            new CircleWithCustomAException(5);
            new CircleWithCustomAException(-5);
            new CircleWithCustomAException(0);
        }catch (InvalidRadiusException e){
            System.out.println(e);
        }
        System.out.println("The number of objects created: "+CircleWithCustomAException.getNumberofObjects());
    }
}

class CircleWithCustomAException{
    private double radius;

    private static int numberofObjects=0;

    public CircleWithCustomAException() throws InvalidRadiusException{
        this(1.0);
    }

    public CircleWithCustomAException(double NewRadius) throws InvalidRadiusException{
        setRadius(NewRadius);
        numberofObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException{
        if(newRadius>0)
            this.radius=newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }

    public static int getNumberofObjects(){
        return numberofObjects;
    }

    public double findArea(){
        return radius*radius*Math.PI;
    }
}

class InvalidRadiusException extends Exception{
    private double radius;

    public InvalidRadiusException(double radius){
        super("Invalid radius "+radius);
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }
}