package brness.pac20.Universal;

import java.util.ArrayList;

public class GenericStack<E> {
    private ArrayList<E> list=new ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize()-1);
    }

    public void push(E x){
        list.add(x);
    }

    public E pop(){
        E o=list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack"+list.toString();
    }

    public static void main(String[] args) {
        GenericStack<String> list1=new GenericStack<>();
        list1.push("asdjf");
        list1.push("dfas");
        list1.push("fkjdaasd");

        System.out.println(list1.toString());
        System.out.println(list1.pop());
        System.out.println(list1.pop());
        System.out.println(list1.pop());
    }
}
