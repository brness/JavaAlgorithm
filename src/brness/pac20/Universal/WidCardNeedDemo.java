package brness.pac20.Universal;

public class WidCardNeedDemo {
    public static void main(String[] args) {
        GenericStack<Integer> list=new GenericStack<>();
        list.push(1);
        list.push(2);
        list.push(-1);
        System.out.println("The max number is "+max(list));
    }

    public static double max(GenericStack<? extends Number> list){
        double max=list.pop().doubleValue();
        while (!list.isEmpty()){
            double value=list.pop().doubleValue();
            if(max<value)
                max=value;
        }
        return max;
    }
}
