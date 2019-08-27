package brness.pac20.Universal;

import java.util.ArrayList;

public class GenericS<E> extends ArrayList<E>{
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return size();
    }

    public Object peek() {
        return get(getSize() - 1);
    }

    public Object pop() {
        Object o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    public Object push(E o) {
        add(o);
        return o;
    }

    public int search(Object o) {
        return indexOf(o);
    }


    public static void main(String[] args) {
        GenericS<String> list=new GenericS<String>();
        list.push("Longdon");
        list.push("dfas");
        int size=list.getSize();
        boolean empty=list.isEmpty();
        System.out.println(size);
        System.out.println(empty);

    }
}

