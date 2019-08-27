package brness.pac23.Complexity;

public class ImprovedFibo {
    public static void main(String[] args) {
        long x=fib(5);
        System.out.println("The number of 5 is "+x);
    }

    public static long fib(long n){
        long f0=0;
        long f1=1;
        long f2=1;
        if (n==0)
            return f0;
        if (n==1)
            return f1;
        else if (n==2)
            return f2;

        for(int i=3;i<=n;i++){
            f0=f1;
            f1=f2;
            f2=f0+f1;
        }
        return f2;
    }
}
