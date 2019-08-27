package brness.pac9.TheThinkingOfObject;

public class StackOfInteger {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY=16;

    public StackOfInteger(int capacity){
        elements =new int[capacity];
    }

    public void push(int value){
        if(size>=elements.length){
            int[] temp=new int[elements.length*2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements=temp;
        }
        elements[size++]=value;
    }

    public int pop(){
        return elements[--size];
    }

    public int peek(){
        return elements[elements.length-1];
    }

    public boolean empty(){
        return size==0;
    }

    public int getSize(){
        return size;
    }
}
