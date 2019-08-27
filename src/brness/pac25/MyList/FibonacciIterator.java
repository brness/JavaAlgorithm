package brness.pac25.MyList;

import java.util.Iterator;
import java.util.Scanner;

public class FibonacciIterator implements Iterator<Integer>{
    private int index;
    private int f0=1;
    private int f1=1;

    public FibonacciIterator(int index){
        this.index=index;
    }

    @Override
    public Integer next() {
        int temp=f0;
        f0=f1;
        f1=f0+temp;

        return f0;
    }

    @Override
    public boolean hasNext() {
        if (f1<index){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        FibonacciIterator fibo=new FibonacciIterator(100000);
        while (fibo.hasNext()){
            System.out.print(fibo.next()+" ");
        }
    }
}
