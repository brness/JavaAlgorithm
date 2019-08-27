package brness.pac25.MyList;

import java.util.LinkedList;

public class GenericQueue<E> {
    private LinkedList<E> list=new LinkedList<>();

    public void enqueue(E element){
        list.addFirst(element);
    }

    public E dequeue(){
        return list.removeLast();
    }

    public int getSize(){
        return list.size();
    }

    @Override
    public String toString() {
        return "Queue: "+list.toString();
    }
}
