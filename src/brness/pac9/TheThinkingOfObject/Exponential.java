package brness.pac9.TheThinkingOfObject;

import java.math.BigInteger;
import java.util.Arrays;

public class Exponential {
    public static void main(String[] args) {
        BigInteger k=new BigInteger("10000000000000000000000000000000000000000000000000");
        k=k.add(BigInteger.ONE);

        int count=0;
        while(count<10){
            if(k.remainder(new BigInteger("2")).equals(BigInteger.ZERO)&&
                    k.remainder(new BigInteger("3")).equals(BigInteger.ZERO)){
                count++;
                System.out.println(k);
            }
            k=k.add(BigInteger.ONE);
        }
    }
}
