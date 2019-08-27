package brness.pac21.DataStructure;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.*;

public class GeometricObjectComparator implements Comparator<GeomotricObject>{
    public int compare(GeomotricObject o1,GeomotricObject o2){
        double area1=o1.getArea();
        double area2=o2.getArea();
        if (area1<area2)
            return -1;
        else if(area1==area2)
            return 0;
        else return 1;
    }
}
