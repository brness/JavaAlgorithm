package brness.pac9.TheThinkingOfObject;

public class Quene {
    private int elements[];
    private int size;

    public Quene(){
        elements=new int[8];
        size=0;
    }

    public void enquene(int v){
        if(size>=elements.length){
            int[] temp=new int[elements.length*2+1];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements=temp;
        }
        elements[size++]=v;
    }

    public int dequene(){
        int i=0;
        int p=elements[0];
        //出队前size--
        size--;
        //出队的时候后一个元素把钱一个元素的位置给占据
        while(i<size){
            elements[i]=elements[i+1];
             i++;
        }
        return p;
    }

    public boolean empty(){
        return size==0;
    }

    public int getSize() {
        return size;
    }

    public void getElements() {
        for(int i=0;i<size;i++){
            System.out.print(elements[i]+" ");
        }
    }
}
