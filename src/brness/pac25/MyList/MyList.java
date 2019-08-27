package brness.pac25.MyList;

public interface MyList<E> extends Iterable<E> {
    public void add(E e);

    public void add(int index,E e);

    public void clear();

    public boolean contains(E e);

    public E get(int index);

    public int indexof(E e);

    public boolean isEmpty();

    public int lastIndexof(E e);

    public boolean remove(E e);

    public E remove(int index);

    public Object set(int index,E e);

    public int size();

    public boolean addAll(MyList<E> otherList);

    public boolean removeALl(MyList<E> otherList);

    public boolean retainAll(MyList<E> otherList);
}
