package brness.pac25.MyList;

import java.util.LinkedList;

public class GenericQueueExtends<E> extends LinkedList<E> {
    public static void main(String[] args) {
        GenericQueueExtends<String> queueExtends=new GenericQueueExtends<>();
        queueExtends.enqueue("Tom");
        queueExtends.enqueue("Tim");
        queueExtends.enqueue("Cindy");
        while (queueExtends.size()!=0){
            System.out.println(queueExtends.dequeue());
        }
    }

    public void enqueue(E e){
        addLast(e);
    }

    public Object dequeue(){
        return removeLast();
    }

    public int getSize(){
        return getSize();
    }
}
