package brness.pac9.TheThinkingOfObject;

import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {
        BigInteger b=new BigInteger(""+Long.MAX_VALUE);
        BigInteger sum=new BigInteger("0");
        BigInteger i=new BigInteger("1");
        while(b.compareTo(sum)>0){
            sum=sum.add(i.multiply(new BigInteger("2")).subtract(new BigInteger("1")));
            i=i.add(BigInteger.ONE);
        }

        for(int k=0;k<10;k++){
            System.out.println(i.add(new BigInteger(k+"")).multiply(i.add(new BigInteger(k+""))));
        }
    }
}
