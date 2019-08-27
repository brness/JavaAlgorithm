package brness.pac9.TheThinkingOfObject;

public class TestQuene {
    public static void main(String[] args) {
        Quene q=new Quene();
        for(int i=1;i<21;i++){
            q.enquene(i);
        }
        q.getElements();
        for(int i=1;i<10;i++){
            q.dequene();
            System.out.println();
            q.getElements();
        }
    }
}
