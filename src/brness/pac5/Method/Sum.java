package brness.pac5.Method;

public class Sum {
    public static void main(String[] args) {
        System.out.println("i       m(i)");
        System.out.println("------------");
        for(int i=0;i<20;i++){
            System.out.println((i+1)+"      "+mm(i+1));
        }
    }

    public static double mm(int x){
        double sum=0;
        for(int i=1;i<=x;i++){
            sum=sum+(double)i/(i+1);
        }
        return sum;
    }
}
