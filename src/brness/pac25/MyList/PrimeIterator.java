package brness.pac25.MyList;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeIterator implements Iterator<Integer>{
    private int index;
    private int x=1;

    public PrimeIterator(int index){
        this.index=index;
    }

    @Override
    public Integer next() {
        x++;
        while (!isPrime(x)) x++;
        return x;
    }

    private boolean isPrime(int t){
        for (int i=2;i<t;i++){
            if (t%i==0)
                return false;
        }
        return true;
    }

    @Override
    public boolean hasNext() {
        while (!isPrime(x+1)) x++;
        if (x+1<index)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        PrimeIterator prime=new PrimeIterator(3);
        while (prime.hasNext()){
            System.out.print(prime.next()+" ");
        }
    }
}
