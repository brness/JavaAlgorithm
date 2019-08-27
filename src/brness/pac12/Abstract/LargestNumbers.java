package brness.pac12.Abstract;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list=new ArrayList<>();
        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("1928347128934123"));
        list.add(new BigDecimal("1.2234231523452345"));
        System.out.println("The largest number is "+getlargestNumber(list));
    }

    public static Number getlargestNumber(ArrayList<Number> list){
        if(list.size()==0||list==null)
            return null;
        Number number=list.get(0);
        for(int i=1;i<list.size();i++){
            if(number.doubleValue()<list.get(i).doubleValue())
                number=list.get(i);
        }
        return number;
    }
}
