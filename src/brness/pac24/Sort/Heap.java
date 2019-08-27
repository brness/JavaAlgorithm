package brness.pac24.Sort;

import java.util.ArrayList;

public class Heap <E extends Comparable<E>>{
    private ArrayList<E> list=new ArrayList<>();

    public Heap(){}

    public Heap(E[] objects){
        for (int i=0;i<objects.length;i++){
            add(objects[i]);
        }
    }

    public void add(E newObject){
        list.add(newObject);
        int currentIndex=list.size()-1;

        while (currentIndex>0){
            int parentIndex=(currentIndex-1)/2;
            //如果比它的父节点要大，则交换
            if (list.get(currentIndex).compareTo(list.get(parentIndex))>0){
                E temp=list.get(currentIndex);
                list.set(currentIndex,list.get(parentIndex));
                list.set(parentIndex,temp);
            }
            else
                break;

            currentIndex=parentIndex;
        }
    }

    public E remove(){
        if (list.size()==0) return null;

        E removeObject=list.get(0);
        list.set(0,list.get(list.size()-1));
        list.remove(list.size()-1);

        int currentIndex=0;
        while (currentIndex<list.size()){
            int leftChild=2*currentIndex+1;
            int rightChild=2*currentIndex+2;
            //找到两个子节点中最大的哪一个
            if (leftChild>=list.size()) break;//左孩子都超出了边界，就排好序了
            int maxIndex=leftChild;
            if (rightChild<list.size()){
                if (list.get(maxIndex).compareTo(list.get(rightChild))<0){
                    maxIndex=rightChild;
                }
            }

            //如果现在的节点比子节点的值要小，则交换
            if(list.get(currentIndex).compareTo(list.get(maxIndex))<0){
                E temp=list.get(currentIndex);
                list.set(currentIndex,list.get(maxIndex));
                list.set(maxIndex,temp);
                currentIndex=maxIndex;
            }
            else break;
        }

        return removeObject;
    }

    public int getSize(){
        return list.size();
    }
}
