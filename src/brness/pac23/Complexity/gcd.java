package brness.pac23.Complexity;

public class gcd {
    public static void main(String[] args) {
        int x=gcdd(46,24);
        System.out.println("The gcd of the number is "+x);
    }

    public static int gcdd(int m,int n){
        int gcd=1;
        for(int k=2;k<=m&&k<=n;k++){
            if(m%k==0&&n%k==0)
                gcd=k;
        }
        return gcd;
    }
}
