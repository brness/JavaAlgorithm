package brness.pac25.MyList;

public abstract class MyAbstractList<E> implements MyList<E> {
    protected int size=0;

    protected MyAbstractList(){};

    protected MyAbstractList(E[] objects){
        for (int i=0;i<objects.length;i++){
            add(objects[i]);
        }
    }

    public void add(E e){
        add(size,e);
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public boolean remove(E e){
        if (indexof(e)>=0){
            remove(indexof(e));
            return true;
        }
        else return false;
    }

    @Override
    public boolean addAll(MyList<E> otherList) {
        boolean change=false;
        for (int i=0;i<otherList.size();i++){
            add(otherList.get(i));
        }
        if (otherList.size()>0)
            change=true;
        return change;
    }

    @Override
    public boolean removeALl(MyList<E> otherList) {
        boolean change=false;
        for (int i=0;i<otherList.size();i++){
            if (remove(otherList.get(i)))
                change=true;
        }

        return change;
    }

    @Override
    public boolean retainAll(MyList<E> otherList) {
        boolean change=false;
        for (int i=0;i<this.size;){
            if (!otherList.contains(this.get(i))){
                remove(get(i));
                change=true;
            }
            else
                i++;
        }
        return change;
    }
}
