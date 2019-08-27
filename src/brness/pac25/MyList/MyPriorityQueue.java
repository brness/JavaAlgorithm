package brness.pac25.MyList;

import brness.pac24.Sort.Heap;

public class MyPriorityQueue<E extends Comparable<E>> {
    private Heap<E> heap=new Heap<E>();

    public void enqueue(E element){
        heap.add(element);
    }

    public E dequeue(){
        return heap.remove();
    }

    public int getSize(){
        return heap.getSize();
    }
}
