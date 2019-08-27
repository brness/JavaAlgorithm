package brness.pac10.Extends;

public class CastDeemo {
    public static void main(String[] args) {
        Object object1=new CircleFromSimpleGeometricObject(1);
        displayObject(object1);
    }

    public static void displayObject(Object object){
        if(object instanceof  CircleFromSimpleGeometricObject){
            System.out.println("The circle area is "+((CircleFromSimpleGeometricObject) object).getArea());
        }
    }
}
