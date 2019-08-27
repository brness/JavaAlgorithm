package brness.pac21.DataStructure;

import java.util.Comparator;

public class TestGeometric {
    public static void main(String[] args) {
        GeomotricObject[] list={new Circle(5.0),new Rectangle(4,5),new Circle(5.5),
        new Rectangle(2.4,5),new Circle(0.5),new Rectangle(4,65),new Circle(4.5),
        new Rectangle(4.4,1),new Circle(6.5),new Rectangle(4,5)};
        selectionSort(list,new GeometricComparaot());
        for(GeomotricObject object:list){
            System.out.println(object.getArea());
        }
    }

    public static <E>/*这个代表的是泛型方法*/ void selectionSort(E[] list, Comparator<? super E> comparator){
        for (int i=0;i<list.length;i++){
            E get=list[i];
            int p=i;
            for (int j=i+1;j<list.length;j++){
                if (comparator.compare(list[j],get)>0){
                    get=list[j];
                    p=j;
                }
            }
            list[p]=list[i];
            list[i]=get;
        }
    }
}

class GeometricComparaot implements Comparator<GeomotricObject>{
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
