package brness.pac10.Extends;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject(1,"red",false));
    }

    public static void displayObject(SimpleGeoetricObject so){
        System.out.println("Created on "+so.getDatecreated()+". Color is "+so.getColor());
    }
}
