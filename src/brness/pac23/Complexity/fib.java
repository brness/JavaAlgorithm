package brness.pac23.Complexity;

public class fib {
    public static void main(String[] args) {
        int x=fibbo(6);
        System.out.println("The index of 3 's the number is "+x);
    }

    public static int fibbo(int n){
        if(n==1)
            return 0;
        if (n==2)
            return 1;
        else return fibbo(n-1)+fibbo(n-2);
    }
}
