package brness.pac25.MyList;

import java.util.ArrayList;

public class GenericStack<E> {
    private ArrayList<E> list=new ArrayList<>();

    public void push(E element){
        list.add(element);
    }

    public E peek(){
        return list.get(list.size()-1);
    }

    public E pop(){
        return list.remove(list.size()-1);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack:"+list.toString();
    }
}
