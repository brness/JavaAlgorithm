package brness.pac12.Abstract;

import brness.pac10.Extends.CircleFromSimpleGeometricObject;

public class ComparableCircle extends CircleFromSimpleGeometricObject implements Comparable<ComparableCircle>{
    public ComparableCircle(double x){
        super(x);
    }

    public int compareTo(ComparableCircle o){
        if(getArea()>o.getArea())
            return 1;
        else if(getArea()<o.getArea())
            return -1;
        else return 0;
    }
}
