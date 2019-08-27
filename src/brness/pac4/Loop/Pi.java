package brness.pac4.Loop;

public class Pi {
    public static void main(String[] args) {
        for(int k=10000;k<=100000;k=k+10000) {
            double x=0;
            for (int i = 1; i <= k; i++) {
                x = x + Math.pow(-1, i + 1) / (2 * i - 1);
            }
            System.out.println("Pi is approximately "+4*x);
        }
    }
}
