package brness.pac5.Method;

public class Sqrt {
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            System.out.println("the sqrt of "+i+" is "+sqrt(i));
        }
    }

    public static double sqrt(double x){
        double i=1.0;
        double next=(i+(x/i))*0.5;
        while(Math.abs(i-next)>=0.00001){
            i=next;
            next=(i+x/i)*0.5;
        }
        return next;
    }
}
