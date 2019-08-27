package brness.pac23.Complexity;

public class GCDTime {
    public static void main(String[] args) {

        for (int i=40;i<45;i++){
            long start1=System.currentTimeMillis();
            gcd(fib(i),fib(i+1));
            long end1=System.currentTimeMillis();
            System.out.println("The "+i+" time of gcd is "+(end1-start1)+"million seconds");
            long start2=System.currentTimeMillis();
            gcdEclid(fib(i),fib(i+1));
            long end2=System.currentTimeMillis();
            System.out.println("The "+i+" time of Eclid gcd is "+(end2-start2)+"million seconds");
        }
    }
    public static int fib(int x){
        if (x==0)
            return 0;
        if (x==1)
            return 1;
        else return fib(x-1)+fib(x-2);
    }
    public static int gcd(int m,int n){
        int gcd=1;
        if (m%n==0)
            return n;

        for(int k=n/2;k>1;k--){
            if (m%k==0&&n%k==0){
                gcd=k;
                break;
            }
        }
        return gcd;
    }

    public static int gcdEclid(int m,int n){
        if (m%n==0)
            return n;
        else return gcdEclid(n,m%n);
    }
}
