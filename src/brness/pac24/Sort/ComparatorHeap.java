package brness.pac24.Sort;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorHeap <E>{
    private ArrayList<E> list=new ArrayList<E>();
    private Comparator<? super E > comparator;

    public ComparatorHeap(){};

    public ComparatorHeap(E[] object){
        for (int i=0;i<object.length;i++)
            list.add(object[i]);
    }

    public ComparatorHeap(Comparator<? super E> comparator){
        this.comparator=comparator;
    }

    public void add(E newobject){
        list.add(newobject);
        int currentIndex=list.size()-1;

        while(currentIndex>0){
            int parentIndex=(currentIndex-1)/2;
            if (comparator.compare(list.get(currentIndex),(list.get(parentIndex)))<0){
                E temp=list.get(currentIndex);
                list.set(currentIndex,list.get(parentIndex));
                list.set(parentIndex,temp);
            }
            else break;

            currentIndex=parentIndex;
        }
    }

    public E remove(){
        if (list.size()==0) return null;

        E removeobject=list.get(0);
        list.set(0,list.get(list.size()-1));
        list.remove(list.size()-1);

        int currentIndex=0;
        while (currentIndex<list.size()){
            int leftChildIndex=2*currentIndex+1;
            int rightChildIndex=2*currentIndex+2;

            if (leftChildIndex>=list.size()) break;
            int minIndex=leftChildIndex;
            if (rightChildIndex<list.size()){
                if (comparator.compare(list.get(minIndex),(list.get(rightChildIndex)))>0){
                    minIndex=rightChildIndex;
                }
            }

            if (comparator.compare(list.get(currentIndex),(list.get(minIndex)))>0){
                E temp=list.get(minIndex);
                list.set(minIndex,list.get(currentIndex));
                list.set(currentIndex,temp);
                currentIndex=minIndex;
            }
            else break;
        }
        return removeobject;
    }

    public int getSize(){
        return list.size();
    }
}
