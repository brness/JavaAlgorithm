package brness.pac24.Sort;


import brness.pac21.DataStructure.Circle;
import brness.pac21.DataStructure.GeometricObjectComparator;
import brness.pac21.DataStructure.GeomotricObject;

public class ComparatorHeapTest {
    public static void main(String[] args) {
        ComparatorHeap<GeomotricObject> heap =
                new ComparatorHeap(new GeometricObjectComparator());

        heap.add(new Circle(5));
        heap.add(new Circle(7));

        heap.add(new Circle(1));

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());


    }
}
