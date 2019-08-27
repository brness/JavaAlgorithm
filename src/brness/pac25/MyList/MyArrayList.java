package brness.pac25.MyList;

import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E>{
    public static final int INITIAL_CAPACITY=16;
    private E[] data=(E[])new Object[INITIAL_CAPACITY];

    public MyArrayList(){};

    public MyArrayList(E[] objects){
        for (int i=0;i<objects.length;i++){
            add(objects[i]);
        }
//        super(objects);
    }

    public void add(int index,E e){
        ensureCapacity();

        for (int i=size-1;i>=index;i--){
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }

    private void ensureCapacity(){
        if (size>=data.length){
            E[] temp=(E[]) new Object[size*2+1];
            System.arraycopy(data,0,temp,0,size);
            data=temp;
        }
    }

    public void clear(){
        data=(E[]) new Object[INITIAL_CAPACITY];
        size=0;
    }

    public boolean contains(E e){
        for (int i=0;i<size;i++){
            if (data[i]==e)
                return true;
        }
        return false;
    }

    public E get(int index){
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("index "+index+" out of bounds");
        }
    }

    public int indexof(E e){
        for (int i=0;i<size;i++){
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

    public int lastIndexof(E e){
        for (int i=size-1;i>=0;i++){
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

    public E remove(int index){
        checkIndex(index);

        for (int i=index;i<size;i++){
            data[i]=data[i+1];
        }
        data[size-1]=null;

        size--;
        return data[index];
    }

    public E set(int index,E e){
        checkIndex(index);
        E old=data[index];
        data[index]=e;
        return old;
    }

    public String toString(){
        StringBuilder result=new StringBuilder("[");
        for (int i=0;i<size;i++){
            result.append(data[i]);
            if (i<size-1) result.append(", ");
        }
        return result.toString()+"]";
    }

    public void trimToSize(){
        if (size!=data.length){
            E[] temp=(E[]) new Object[size];
            System.arraycopy(data,0,temp,0,size);
            data=temp;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<E>{
        private int current=0;

        public boolean hasNext(){
            return (current<size);
        }

        public E next(){
            return data[current++];
        }

        public void remove(){
            MyArrayList.this.remove(current);
        }
    }
}
