package brness.pac12.Abstract;

import brness.pac10.Extends.CircleFromSimpleGeometricObject;
import brness.pac10.Extends.SimpleGeoetricObject;

public class Sumup {
    public static void main(String[] args) {
        SimpleGeoetricObject[] a=new SimpleGeoetricObject[3];
        a[0]=new CircleFromSimpleGeometricObject(4);
        a[1]=new CircleFromSimpleGeometricObject(5);
        a[2]=new CircleFromSimpleGeometricObject(6);
        double area=sumArea(a);
        System.out.println(area);
    }

    public static double sumArea(SimpleGeoetricObject[] a){
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=((CircleFromSimpleGeometricObject)a[i]).getArea();
        }
        return sum;
    }
}
